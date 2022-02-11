package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import utils.AllureUtils;
@Log4j2
public class EntriesSettingTest extends BaseTest {
    @Step("Input Variable email and password.")
    @Test(description = "Variable login in monkkee.")
    public void SettingTest() {
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
        log.info("Click on setting button and opened page");
        entriesSettingPage
                .clickSettingButton()
                .settingTitleShouldBeVisible();

    }
}
