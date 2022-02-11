package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntriesSettingPage extends BasePage{
    public static final By SETTING_BUTTON = By.xpath("//div[@class='ng-scope']/a[@class='user-menu-btn']");
    public static final By SETTING_TITLE = By.xpath("//div[@class='container-fluid']/h1[text()='Language selection']");

    public EntriesSettingPage clickSettingButton(){
        $(SETTING_BUTTON).click();
        return new EntriesSettingPage();

    }
    public EntriesSettingPage settingTitleShouldBeVisible(){
        $(SETTING_TITLE).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
}
