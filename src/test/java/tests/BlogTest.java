package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import utils.AllureUtils;
@Log4j2
public class BlogTest extends BaseTest{
    @Step("Login => Open Blog Page and test entries about food dog")
    @Test(description = "Testing blog page about dog food.")
    public void BlogAboutFoodDog() throws InterruptedException {
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
        log.info("Opened Blog page and test entries about dog food.");
        blogPage
                .openBlogPage()
                .checkTitleBlogVisible()
                .dogFoodLinkCheck()
                .dogFoodTitleCheckVisible()
                .dogFoodLinkWiki()
                .checkWikiTitleAboutDog();
    }
    @Step("Login => Open Blog Page and test entries about forget password." +
            "Variable email")
    @Test(description = "Testing password remainder with variable email.")
    public void PasswordRemainderVariableEmail() throws InterruptedException{
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
        log.info("Opened Blog Page and test entries password reminder with input variable email.");
        blogPage
                .openBlogPage()
                .checkTitleForgetPasswordVisible()
                .imgPasswordPolicyVisibleCheck()
                .linkPasswordReminder()
                .titlePasswordReminderShouldHave()
                .inputVariableEmailPasswordReminder()
                .checkMessageAfterInputVariableEmail();
    }
    @Step("Login => Open Blog Page and test entries about forget password." +
            "invalid email.")
    @Test(description = "Test password remainder with invalid email")
    public void PasswordRemainderInvalidEmail() throws InterruptedException{
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
        log.info("Input invalid email and check error message");
        blogPage
                .openBlogPage()
                .checkTitleForgetPasswordVisible()
                .linkPasswordReminder()
                .inputInvalidEmailPasswordReminder()
                .checkErrorMessageInvalidEmail();


    }
}
