package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    public static final By INPUT_EMAIL = By.xpath("//input[@id='login']");
    public static final By INPUT_PASSWORD = By.xpath("//input[@id='password']");
    public static final By SUBMIT_FORM_LOGIN = By.xpath("//div[@class='btn-text-content']");
    public static final By IMG_LOGO = By.xpath("//div[@class='logo']//img[@alt='Logo']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@id='main']//div[@class='login-wrapper']//div[@class='alert alert-danger']");
    public static final By ERROR_MESSAGE_DATA_EMAIL = By.xpath("//div[@id='main']/div[@class='ng-scope']/div[2]//form/div[2]/div[@class='col-sm-9']/div[@class='help-block ng-binding']");
    public static final By ERROR_MESSAGE_DATA_PASSWORD = By.xpath("//div[@id='main']/div[@class='ng-scope']/div[2]//form/div[3]/div[@class='col-sm-9']/div[@class='help-block ng-binding']");
    public static final By TITLE_SEARCH = By.xpath("//section[@id='search']/h1");
    public static final By BUTTON_CANCEL_DONATION = By.xpath("//div[@class='donation-notice-buttons']/button/div[@class='btn-text-content']");
    public static final By TITLE_DONATION = By.xpath("//h1[.='Feed the monkkee']");

    @Step("Open Login page.")
    public LoginPage openLoginPage() {
        open("https://my.monkkee.com/#/");
        return new LoginPage();

    }

    @Step("Input Variable email.")
    public LoginPage inputVariableEmail() {
        $(INPUT_EMAIL).setValue(email);
        return new LoginPage();
    }
    @Step("Input variable password.")
    public LoginPage inputVariablePassword() {
        $(INPUT_PASSWORD).setValue(password);
        return new LoginPage();
    }
    @Step("Submit form. If after submit form opened page with donations we should be click on cancel button.")
    public EntriesPage submitFormLogin() throws InterruptedException {
        $(SUBMIT_FORM_LOGIN).submit();
        Thread.sleep(3000);
        if ($(By.xpath("//h1[.='Feed the monkkee']")).is(Condition.visible)) {
            $(By.xpath("//div[@class='donation-notice-buttons']/button/div[@class='btn-text-content']")).click();
        }
        return new EntriesPage();
    }
    @Step("Img logo should be visible.")
    public LoginPage imgLogoVisible() {
        $(IMG_LOGO).shouldBe(Condition.visible);
        return new LoginPage();
    }
    @Step("Input invalid password.")
    public LoginPage inputInvalidPassword() {
        $(INPUT_PASSWORD).setValue("password");
        return new LoginPage();
    }
    @Step("Input invalid email.")
    public LoginPage inputInvalidEmail() {
        $(INPUT_EMAIL).setValue("12345456@aej.com");
        return new LoginPage();
    }
    @Step("Check error message.")
    public LoginPage errorMessage() {
        $(ERROR_MESSAGE).shouldBe(Condition.visible);
        return new LoginPage();
    }
    @Step("Check two errors messages")
    public LoginPage fullErrorDataMessage() {
        $(ERROR_MESSAGE_DATA_EMAIL).shouldBe(Condition.visible);
        $(ERROR_MESSAGE_DATA_PASSWORD).shouldBe(Condition.visible);
        return new LoginPage();
    }
    @Step("Submit form email and password for negativ test.")
    public LoginPage submitForm() {
        $(SUBMIT_FORM_LOGIN).submit();
        return new LoginPage();
    }


}
