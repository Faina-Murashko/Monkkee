package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import utils.AllureUtils;
@Log4j2
public class EntriesSettingTest extends BaseTest {
    @Step("Test setting page.")
    @Test(description = "Variable login in monkkee.")
    public void SettingTest() throws InterruptedException {
        log.info("Logo visibility check.");
        loginPage
                .openLoginPage()
                .imgLogoVisible();
        log.info("Here we enter the correct user data.");
        loginPage
                .inputVariableEmail()
                .inputVariablePassword()
                .submitFormLogin();
        log.info("Check visibility tags, calendar and search.");
        entriesPage
                .checkTitleCalendar()
                .checkTitleSearch()
                .checkTitleTags();
        AllureUtils.takeScreenshot();
        log.info("Click on setting button and opened page.");
        log.info("Check setting visible.");
        entriesSettingPage
                .clickSettingButton()
                .settingTitleShouldBeVisible()
                .settingEmailShouldBeVisible()
                .settingPasswordShouldBeVisible()
                .settingLoginAliasShouldBeVisible()
                .settingTimeOutShouldBeVisible()
                .settingEditorShouldBeVisible()
                .settingExportShouldBeVisible()
                .settingDonationsShouldBeVisible()
                .settingDeleteAccountShouldBeVisible();
        AllureUtils.takeScreenshot();
        log.info("Opened Inactivity timeout.");
        entriesSettingPage
                .settingTimeOutOpen();
        log.info("Selecting the standby setting.");
        entriesSettingPage
                .settingWaitOpen()
                .settingWaitFiveMinutes()
                .settingWaitOpen()
                .settingWaitTenMinutes()
                .settingWaitSubmit();




    }
}
