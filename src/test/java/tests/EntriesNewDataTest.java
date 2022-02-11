package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.AllureUtils;

import static utils.AllureUtils.takeScreenshot;

@Log4j2
public class EntriesNewDataTest extends BaseTest {
    @Step("Input Variable email and password.")
    @Test(description = "Variable login in monkkee.")
    public void LogIn() {
        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter the correct user data.");
        loginPage
                .inputVariableEmail()
                .inputVariablePassword()
                .submitFormLogin();
        log.info("Click on button create new entry.");
        entriesNewDataPage
                .clickOnCreateNewEntries();
        log.info("Check tool bar visibility.");
        entriesNewDataPage
                .checkToolBar();
        log.info("Input data title in new entry.");
        entriesNewDataPage
                .choiceBoltFontOnOff()
                .visibilityFullToolBar()
                .centeredText()
                .inputMessageTitle()
                .choiceBoltFontOnOff()
                .textAlignLeft()
                .inputFullMessage()
                .clickSaveEntries()
                .turnToolBar()
                .inputTagName()
                .clickButtonTags()
                .clickOnButtonHomePage();
        log.info("Back to home page.");
        AllureUtils.takeScreenshot();

    }
}