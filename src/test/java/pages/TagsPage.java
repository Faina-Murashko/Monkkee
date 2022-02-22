package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TagsPage extends BasePage {
    public static final By BUTTON_MANAGER_TAGS = By.xpath("//section[@id='tags']//a[text()='Manage tags']");
    public static final By TITLE_MANAGER_TAGS = By.xpath("//h1[.='Manage Tags']");
    public static final By EDIT_TAGS = By.xpath("//div[@id='main']//table[@class='spaced-table']/tbody/tr[2]/td[@class='buttons']/a[1]");
    public static final By TITLE_EDIT_TAGS = By.xpath("//h1[.='Edit Tag']");
    public static final By INPUT_TAG_NAME = By.xpath("//input[@id='tag']");
    public static final By BUTTON_SUBMIT = By.xpath("//button[@class='btn btn-primary']");

    @Step("Click on button manager tags and open setting tags.")
    public TagsPage clickOnButtonManagerTags() {
        $(BUTTON_MANAGER_TAGS).click();
        return new TagsPage();
    }
    @Step("Title manager tags should be visible.")
    public TagsPage titleTagsShouldBeVisible(){
        $(TITLE_MANAGER_TAGS).shouldBe(Condition.visible);
        return new TagsPage();
    }
    @Step("Click on button for edit tags.")
    public TagsPage buttonEditTags(){
        $(EDIT_TAGS).click();
        return new TagsPage();
    }
    @Step("Title edit tags should be visible.")
    public TagsPage titleEditTagsShouldBeVisible(){
        $(TITLE_EDIT_TAGS).shouldBe(Condition.visible);
        return new TagsPage();
    }
    @Step("Clear tag name.")
    public TagsPage clearTagName(){
        $(INPUT_TAG_NAME).clear();
        return new TagsPage();
    }
    @Step("Click on button submit setting page.")
    public TagsPage clickOnButtonSubmit(){
        $(BUTTON_SUBMIT).click();
        return new TagsPage();
    }
}
