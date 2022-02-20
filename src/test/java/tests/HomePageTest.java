package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Log4j2
public class HomePageTest extends BaseTest {
    WebDriver driver;
    @Step("Input Variable email and password.")
    @Test(description = "Variable login in monkkee.")
    public void HomePage() throws InterruptedException {
        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter the correct user data.");
        loginPage
                .inputVariableEmail()
                .inputVariablePassword()
                .submitFormLogin();
        log.info("Open home page and check sign up");
        homePage
                .openHomePage()
                .titleHomePageVisible()
                .buttonSignUpVisible()
                .buttonSignUpClick()
                .titleRegistrationVisible();
        log.info("Check button to my account");
        homePage
                .openHomePage()
                .buttonToMyAccountVisible()
                .buttonToMyAccountClick();

        homePage
                .openHomePage()
                .titleFeaturesVisible()
                .titleSecurityVisible()
                .titleDonationsVisible()
                .titleTeamVisible();



    }
}
