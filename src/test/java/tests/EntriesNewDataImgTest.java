package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import pages.LoginPage;
@Log4j2
public class EntriesNewDataImgTest extends BaseTest {
    @Step("Test new data img entries page.")
    @Test(description = "Variable login in monkkee.")
    public void EntriesDataImage() throws InterruptedException {
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
                .choiceBoltFontOnOff()
                .visibilityFullToolBar()
                .choiceBoltFontOnOff()
                .centeredText();
        log.info("Add parameters for entries with img");
        entriesNewDataImgPage
                .inputTitleText()
                .clickImgButton()
                .propertiesCheckVisible()
                .inputUrlImg()
                .choiceImgAlignCenter()
                .submitImgProperties();
        log.info("Save entries");
        entriesNewDataPage
                .clickSaveEntries()
                .turnToolBar();
        log.info("Adding tag name");
        entriesNewDataImgPage
                .addTagsName()
                .submitTagName();
        log.info("return to home page");
        entriesNewDataPage
                .clickOnButtonHomePage();

    }
}
