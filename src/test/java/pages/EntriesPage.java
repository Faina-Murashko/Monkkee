package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntriesPage extends BasePage{
    public static final By TITLE_SEARCH = By.xpath("//section[@id='search']/h1");
    public static final By TITLE_TAGS = By.xpath("//section[@id='tags']/h1");
    public static final By TITLE_CALENDAR = By.xpath("//section[@id='calendar']/h1");
    public static final By TITLE_ENTRIES = By.xpath("//div[text()='Welcome to monkkee!']");
    public static final By TOOL_BAR_DELETE = By.xpath("//div[@class='btn-toolbar']/*[@id='delete-entry']");

    @Step("Title search should be visible.")
    public EntriesPage checkTitleSearch(){
        $(TITLE_SEARCH).shouldBe(Condition.visible);
        return new EntriesPage();
    }
    @Step("Title tag should be visible.")
    public EntriesPage checkTitleTags(){
        $(TITLE_TAGS).shouldBe(Condition.visible);
        return new EntriesPage();
    }
    @Step("Title calendar should be visible.")
    public EntriesPage checkTitleCalendar(){
        $(TITLE_CALENDAR).shouldBe(Condition.visible);
        return new EntriesPage();
    }
    @Step("Click on welcome entries.")
    public EntriesPage clickWelcomeEntries(){
        $(TITLE_ENTRIES).click();
        return new EntriesPage();
    }
    @Step("Button delete should be visible.")
    public EntriesPage checkToolBarButtonDelete(){
        $(TOOL_BAR_DELETE).shouldBe(Condition.visible);
        return new EntriesPage();
    }

}
