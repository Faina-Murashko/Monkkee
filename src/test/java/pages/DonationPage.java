package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class DonationPage extends BasePage {
    public static final By TITLE_DONATIONS = By.xpath("//section[@id='support-us-with-a-donation']//h1");
    public static final By EURO_LOGO = By.xpath("//form[@id='donate-form']/label[.='€']");
    public static final By INPUT_DONATIONS = By.xpath("//input[@id='amount']");
    public static final By PAYPAL_LOGO = By.xpath("//div[@id='paypal-button-container']");
    public static final By BUTTON_PRIVACY_POLICY = By.xpath("//input[@id='policy']");
    public static final By BUTTON_POST_COMMENT = By.xpath("//button[@id='submitcomment']");
    public static final By INPUT_EMAIL = By.xpath("//input[@id='email']");
    public static final By INPUT_NAME = By.xpath("//input[@id='author']");
    public static final By ERROR_MESSAGE_INVALID_EMAIL = By.xpath("//body[@id='error-page']/p[text()=': please enter a valid email address.']");
    public static final By ERROR_MESSAGE_INVALID_EMAIL_NAME = By.xpath("//body[@id='error-page']/p[text()=': please fill the required fields (name, email).']");



    @Step("Open donation page.")
    public DonationPage openDonationPage() {
        open("https://www.monkkee.com/en/support-us-with-a-donation/");
        return new DonationPage();
    }

    @Step("Title donation should be visible.")
    public DonationPage titleDonationShouldBeVisible() {
        $(TITLE_DONATIONS).shouldBe(Condition.visible);
        return new DonationPage();
    }

    @Step("Logo Euro shold be visible.")
    public DonationPage logoEuroShouldHaveText() {
        $(EURO_LOGO).should(Condition.text("€"));
        return new DonationPage();
    }

    @Step("Input 5 euro donations.")
    public DonationPage input5Euro() {
        $(INPUT_DONATIONS).sendKeys("5");
        return new DonationPage();
    }

    @Step("Logo paypal after input 5 euro should be visible.")
    public DonationPage logoPayPalShouldBeVisible() {
        $(PAYPAL_LOGO).should(Condition.visible);
        return new DonationPage();
    }

    @Step("Submit privacy policy.")
    public DonationPage submitPrivacyPolicy(){
        $(BUTTON_PRIVACY_POLICY).click();
        return new DonationPage();
    }
    @Step("Submit post comment.")
    public DonationPage submitFormComment(){
        $(BUTTON_POST_COMMENT).submit();
        return new DonationPage();
    }
    @Step("Input invalid email.")
    public DonationPage inputInvalidEmail(){
        $(INPUT_EMAIL).sendKeys("que11111");
        return new DonationPage();
    }
    @Step("Input invalid name.")
    public DonationPage inputInvalidName(){
        $(INPUT_NAME).sendKeys("");
        return new DonationPage();
    }
    @Step("Check error message invalid email.")
    public DonationPage errorMessageInvalidEmail(){
        $(ERROR_MESSAGE_INVALID_EMAIL).should(Condition.text(": please enter a valid email address."));
        return new DonationPage();
    }
    @Step("Check error message invalid email and name.")
    public DonationPage errorMessageInvalidEmailAndName(){
        $(ERROR_MESSAGE_INVALID_EMAIL_NAME).should(Condition.text(": please fill the required fields (name, email)."));
        return new DonationPage();
    }







}
