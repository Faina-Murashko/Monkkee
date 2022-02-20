package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.AllureUtils;


@Log4j2
public class LoginTest extends BaseTest {

    @Step("Input Variable email and password.")
    @Test (priority = 3,description = "Variable login in monkkee.")

    public void LogIn() throws InterruptedException {
        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter the correct user data.");
        loginPage
                .inputVariableEmail()
                .inputVariablePassword()
                .submitFormLogin();
        AllureUtils.takeScreenshot();
    }

    @Step("Input for invalid data entry.")
    @Test(priority =1,description = "Input Variable email and invalid password")
    public void invalidLogInPassword() {

        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter valid email and invalid password.");
        loginPage
                .inputVariableEmail()
                .inputInvalidPassword()
                .submitForm();
        log.info("Here we check error message should be visible");
        loginPage
                .errorMessage();

        AllureUtils.takeScreenshot();

    }

    @Step("Input for invalid email and password.")
    @Test(priority = 2,description = "Input Invalid email and password.")
    public void invalidLogInData()  {
        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter invalid email and password");
        loginPage
                .inputInvalidEmail()
                .inputInvalidPassword()
                .submitForm();
        log.info("Here we check full error message data user.");
        loginPage
                .fullErrorDataMessage();

        AllureUtils.takeScreenshot();

    }

}
