package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class EntriesSettingPage extends BasePage{
    public static final By SETTING_BUTTON = By.xpath("//div[@class='ng-scope']/a[@class='user-menu-btn']");
    public static final By SETTING_TITLE = By.xpath("//div[@class='container-fluid']/h1[text()='Language selection']");
    public static final By EMAIL = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/email']");
    public static final By PASSWORD = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/password']");
    public static final By LOGIN_ALIAS = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/login']");
    public static final By TIMEOUT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/logout']");
    public static final By EDITOR = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/editor']");
    public static final By DONATIONS = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/donation_payment']");
    public static final By DELETE_ACCOUNT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/delete_account']");
    public static final By EXPORT = By.xpath("//div[@id='settings-menu']//a[@href='#/settings/export']");
    public static final By WAIT_SETTING = By.xpath("//div[@id='settings-content']//select[@name='autoLogout']");
    public static final By SUBMIT_SETTING_WAIT = By.xpath("/html//div[@id='settings-content']//div[@class='btn-text-content']");
    public static final By ALERT_MESSAGE = By.xpath("//div[@id='settings-content']//div[@class='alert alert-success']");
    public static final By POP_UP_CANCEL = By.xpath("/html/body/div[7]//button[@class='btn btn-primary']");
    public static final By POP_UP_HEADER = By.xpath("//div[@class='modal-header']");

    @Step("Click on setting button and opened setting page.")
    public EntriesSettingPage clickSettingButton(){
        $(SETTING_BUTTON).click();
        return new EntriesSettingPage();

    }
    @Step("In menu title setting email should be visible.")
    public EntriesSettingPage settingEmailShouldBeVisible(){
        $(EMAIL).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting password should be visible.")
    public EntriesSettingPage settingPasswordShouldBeVisible(){
        $(PASSWORD).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting login alias should be visible.")
    public EntriesSettingPage settingLoginAliasShouldBeVisible(){
        $(LOGIN_ALIAS).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting time out should be visible.")
    public EntriesSettingPage settingTimeOutShouldBeVisible(){
        $(TIMEOUT).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("Open setting time out.")
    public EntriesSettingPage settingTimeOutOpen(){
        $(TIMEOUT).click();
        return new EntriesSettingPage();
    }
    @Step("In menu title setting editor should be visible.")
    public EntriesSettingPage settingEditorShouldBeVisible(){
        $(EDITOR).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting donations should be visible.")
    public EntriesSettingPage settingDonationsShouldBeVisible(){
        $(DONATIONS).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting delete account should be visible.")
    public EntriesSettingPage settingDeleteAccountShouldBeVisible(){
        $(DELETE_ACCOUNT).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("Title setting should be visible.")
    public EntriesSettingPage settingTitleShouldBeVisible(){
        $(SETTING_TITLE).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("In menu title setting export should be visible.")
    public EntriesSettingPage settingExportShouldBeVisible(){
        $(EXPORT).shouldBe(Condition.visible);
        return new EntriesSettingPage();
    }
    @Step("Open setting time out.")
    public EntriesSettingPage settingWaitOpen(){
        $(WAIT_SETTING).click();
        return new EntriesSettingPage();
    }
    @Step("Choice wait 5 minutes.")
    public EntriesSettingPage settingWaitFiveMinutes(){
        $(WAIT_SETTING).selectOption("5 minutes");
        return new EntriesSettingPage();
    }
    @Step("Choise wait 10 minutes.")
    public EntriesSettingPage settingWaitTenMinutes(){
        $(WAIT_SETTING).selectOption("10 minutes");
        return new EntriesSettingPage();
    }
    @Step("Submit form wait.")
    public EntriesSettingPage settingWaitSubmit(){
        $(SUBMIT_SETTING_WAIT).submit();
        return new EntriesSettingPage();
    }


}
