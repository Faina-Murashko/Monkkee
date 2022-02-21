package pages;


import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class RegistrationPage extends BasePage{
    public static final By TITLE_REGISTRATION = By.xpath("//div[@class='content-container']/h1[text()='Registration']");
//    public static final By INPUT_EMAIL = By.xpath("//input[@id='registration_email']");
    public static final By INPUT_PASSWORD = By.xpath("//input[@id='registration_password']");
    public static final By INPUT_CONFIRM_PASSWORD = By.xpath("//input[@id='registration_password_confirmation']");
    public static final By INPUT_PASSWORD_HINT = By.xpath("//input[@id='registration_password_hint']");
    public static final By PRIVAT_POLICY = By.xpath("//input[@id='registration_terms_of_use']");
    public static final By RECOVER_PASSWORD = By.xpath("//input[@id='registration_lost_password_warning_registered']");
    public static final By BUTTON_SUBMIT = By.xpath("//div[@class='btn-text-content']");
    public static final By ERROR_MESSAGE_MORE_8_VALUE = By.xpath("//div[@id='registration_password-strength-indicator']");
    public static final By MESSAGE_WEAK_PASSWORD = By.xpath("//div[@id='registration_password-strength-indicator']");
    public static final By ALERT_ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger']");



    @Step("Open registration page.")
    public RegistrationPage openRegistrationPage(){
        open("https://my.monkkee.com/account/registration");
        return new RegistrationPage();
    }
    @Step("Title registration should be visible.")
    public RegistrationPage titleShouldBeVisible(){
        $(TITLE_REGISTRATION).shouldBe(Condition.visible);
        return new RegistrationPage();
    }
//    @Step("Input faker variable email.")
//    public RegistrationPage inputFakeEmail(){
//        $(INPUT_EMAIL).sendKeys("Itakfule1942@einrot.com");
//        return new RegistrationPage();
//    }
    @Step("Input  variable password.")
    public RegistrationPage inputFakeVariablePassword(){
        $(INPUT_PASSWORD).sendKeys("12345678");
        return new RegistrationPage();
    }
    @Step("Input confirm password.")
    public RegistrationPage inputFakeConfirmPassword(){
        $(INPUT_CONFIRM_PASSWORD).sendKeys("12345678");
        return new RegistrationPage();
    }
    @Step("Input password hint.")
    public RegistrationPage inputPasswordHint(){
        $(INPUT_PASSWORD_HINT).sendKeys("oklahoma");
        return new RegistrationPage();
    }
    @Step("Click privat policy.")
    public RegistrationPage clickOnPrivatPolicy(){
        $(PRIVAT_POLICY).click();
        return new RegistrationPage();
    }
    @Step("Click recover password.")
    public RegistrationPage clickOnRecoverPassword(){
        $(RECOVER_PASSWORD).click();
        return new RegistrationPage();
    }
    @Step("Submit form registration.")
    public RegistrationPage submitForm(){
        $(BUTTON_SUBMIT).click();
        return new RegistrationPage();
    }
    @Step("Input password with 7 values.")
    public RegistrationPage invalidPassword(){
        $(INPUT_PASSWORD).sendKeys("1234567");
        return new RegistrationPage();
    }
    @Step("Input confirm password witn 7 values.")
    public RegistrationPage invalidConfirmPassword(){
        $(INPUT_CONFIRM_PASSWORD).sendKeys("1234567");
        return new RegistrationPage();
    }
    @Step("Check error message shold be visible")
    public RegistrationPage errorMessageVisible(){
        $(ERROR_MESSAGE_MORE_8_VALUE).should(Condition.text("Password is too short. Min. 8 characters"));
        return new RegistrationPage();
    }
    @Step("Check message shold be visible")
    public RegistrationPage passwordMessageVisible(){
        $(MESSAGE_WEAK_PASSWORD).should(Condition.text("Password strength: Weak"));
        return new RegistrationPage();
    }

    @Step("Input different confirm password.")
    public RegistrationPage inputDifferentConfirmPassword(){
        $(INPUT_CONFIRM_PASSWORD).sendKeys("12345679");
        return new RegistrationPage();
    }
    @Step("Error message should be visible")
    public RegistrationPage registrationErrorMessage(){
        $(ALERT_ERROR_MESSAGE).should(Condition.text("Registration not successful"));
        return new RegistrationPage();
    }


}
