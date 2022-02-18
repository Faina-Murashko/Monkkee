package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage{
    WebDriver driver;
    public static final By HOME_PAGE_ELEMENT = By.xpath("//ul[@class='footer-menu']//a[@href='https://www.monkkee.com/en/']");
    public static final By TITLE_HOME_PAGE = By.xpath("//section[@id='monkkee-safest-place-thoughts']//p[.='monkkee – the safest place for your thoughts']");
    public static final By BUTTON_SIGNUP = By.xpath("//section[@id='buttons']//a[@href='https://my.monkkee.com/account/registration?language=en']");
    public static final By BUTTON_TO_MY_ACCOUNT = By.xpath("//section[@id='buttons']//a[@href='https://my.monkkee.com/?language=en']");
    public static final By TITLE_REGISTRATION = By.xpath("//form[@id='new_registration']//label[.='Email']");
    public static final By USER_TITLE = By.xpath("/html//div[@id='main']//form//label[.='User']");
    public static final By FEATURES_TITLE = By.xpath("//section[@id='features']//h1");
    public static final By SECURITY_TITLE = By.xpath("//section[@id='security']//h1");
    public static final By DONATIONS_TITLE = By.xpath("//section[@id='business-model-donations']//h1");
    public static final By TEAM_TITLE = By.xpath("//section[@id='team']//h1");

    public HomePage openHomePage(){
        open("https://www.monkkee.com/en/");
        return new HomePage();
    }

//    public HomePage homePageButtonClick(){
//        $(HOME_PAGE_ELEMENT).click();
//        return new HomePage();
//    }

    public HomePage titleHomePageVisible(){
        $(TITLE_HOME_PAGE).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage buttonSignUpVisible(){
        $(BUTTON_SIGNUP).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage buttonToMyAccountVisible(){
        $(BUTTON_TO_MY_ACCOUNT).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage buttonSignUpClick(){
        $(BUTTON_SIGNUP).click();
        return new HomePage();
    }
    public HomePage buttonToMyAccountClick(){
        $(BUTTON_TO_MY_ACCOUNT).click();
        return new HomePage();
    }
    public HomePage titleRegistrationVisible(){
        $(TITLE_REGISTRATION).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage titleUserVisible(){
        $(USER_TITLE).shouldBe(Condition.visible);
        driver.navigate().back();
        return new HomePage();
    }
    public HomePage titleFeaturesVisible(){
        $(FEATURES_TITLE).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage titleSecurityVisible(){
        $(SECURITY_TITLE).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage titleDonationsVisible(){
        $(DONATIONS_TITLE).shouldBe(Condition.visible);
        return new HomePage();
    }
    public HomePage titleTeamVisible(){
        $(TEAM_TITLE).shouldBe(Condition.visible);
        return new HomePage();
    }
}
