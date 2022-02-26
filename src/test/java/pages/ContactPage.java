package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class ContactPage extends BasePage{
    public static final By TITLE_CONTACT = By.xpath("//section[@id='contact']//h1");
    public static final By INPUT_NAME = By.xpath("//input[@name='your-name']");
    public static final By INPUT_EMAIL = By.xpath("//input[@name='your-email']");
    public static final By BUTTON_SEND = By.xpath("//input[@value='Send']");
    public static final By EMAIL_ERROR_MESSAGE = By.xpath("//span[text()='The e-mail address entered is invalid.']");
    public static final By PRIVACY_ERROR_MESSAGE = By.xpath("//span[text()='The field is required.']");


    @Step("Open contact page.")
    public ContactPage openContactPage(){
        open("https://www.monkkee.com/en/contact/");
        return new  ContactPage();
    }

    @Step("Title contact shouls be visible.")
    public ContactPage titleContactVisible(){
        $(TITLE_CONTACT).shouldBe(Condition.visible);
        return new ContactPage();
    }

    @Step("Send invalid name.")
    public ContactPage inputInvalidName(){
        $(INPUT_NAME).sendKeys("12345");
        return new ContactPage();
    }
    @Step("Send invalid name.")
    public ContactPage inputInvalidEmail(){
        $(INPUT_EMAIL).sendKeys("1111111we");
        return new ContactPage();
    }
    @Step("Submit form contact.")
    public ContactPage buttonSendClick(){
        $(BUTTON_SEND).click();
        return new ContactPage();
    }
    @Step("Error email should be visible.")
    public ContactPage errorInvalidEmailVisible(){
        $(EMAIL_ERROR_MESSAGE).shouldBe(Condition.visible);
        return new ContactPage();
    }
    @Step("Error privacy should be visible.")
    public ContactPage errorInvalidSubmitVisible(){
        $(PRIVACY_ERROR_MESSAGE).shouldBe(Condition.visible);
        return new ContactPage();
    }


}
