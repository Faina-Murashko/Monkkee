package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class RegistrationTest extends BaseTest{
    @Step("Open registration page and input variable data.")
    @Test(description = "Input variable email and password.")
    public void InputVariableData(){
        log.info("open registration page.");
        registrationPage
                .openRegistrationPage()
                .titleShouldBeVisible();
        log.info("Check title registration should be visible.");
        log.info("Created new variable account");
        Account account = AccountFactory.get();
        registrationModalPage.createWithFakeEmail(account);
        registrationPage
                .inputFakeVariablePassword()
                .inputFakeConfirmPassword()
                .inputPasswordHint()
                .passwordMessageVisible()
                .clickOnRecoverPassword()
                .clickOnPrivatPolicy()
                .submitForm();
        AllureUtils.takeScreenshot();
    }
    @Step("Open registration page and input password less then 8 values.")
    @Test(description = "Password less then 8 values and check error message.")
    public void InputInvalidPassword(){
        log.info("open registration page.");
        registrationPage
                .openRegistrationPage()
                .titleShouldBeVisible();
        log.info("Check title registration should be visible.");
        log.info("Created new variable account");
        Account account = AccountFactory.get();
        registrationModalPage.createWithFakeEmail(account);
        log.info("Input invalid password");
        registrationPage
                .invalidPassword()
                .invalidConfirmPassword()
                .passwordMessageVisible();
        AllureUtils.takeScreenshot();
    }
    @Step("Open registration page and input different password.")
    @Test(description = "Input different password and check error message.")
    public void InputDifferentPassword(){
        log.info("open registration page.");
        registrationPage
                .openRegistrationPage()
                .titleShouldBeVisible();
        log.info("Check title registration should be visible.");
        log.info("Created new variable account");
        Account account = AccountFactory.get();
        registrationModalPage.createWithFakeEmail(account);
        log.info("Input different password");
        registrationPage
                .inputFakeVariablePassword()
                .inputDifferentConfirmPassword()
                .passwordMessageVisible()
                .inputPasswordHint()
                .clickOnPrivatPolicy()
                .clickOnRecoverPassword()
                .submitForm()
                .registrationErrorMessage();
        AllureUtils.takeScreenshot();



    }
}
