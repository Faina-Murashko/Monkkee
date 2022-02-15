package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntriesSettingPage extends BasePage{
    public static final By SETTING_BUTTON = By.xpath("//div[@class='ng-scope']/a[@class='user-menu-btn']");
    public static final By SETTING_TITLE = By.xpath("//div[@class='container-fluid']/h1[text()='Language selection']");
    public static final By BUTTON_WAIT = By.xpath("//ul[@class='nav nav-list sidenav']/li[@class='active']");
    public static final By TITLE_TIMEOUT = By.xpath("//div[@id='settings-content']/h1[text()='Inactivity timeout']");
    public static final By CHOICE_TIMEOUT = By.xpath("//select[@name='autoLogout']");

    public EntriesSettingPage clickSettingButton(){
        $(SETTING_BUTTON).click();
        return new EntriesSettingPage();

    }
    public EntriesSettingPage settingTitleShouldBeVisible(){
        $(SETTING_TITLE).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    public EntriesSettingPage clickButtonTimeOut(){
        $(BUTTON_WAIT).click();
        return new EntriesSettingPage();
    }
    public EntriesSettingPage titleShouldBeVisible(){
        $(TITLE_TIMEOUT).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    public EntriesSettingPage choiceTimeOut(){
        $(CHOICE_TIMEOUT).selectOptionByValue("5 minutes");
        return new EntriesSettingPage();
    }
}
