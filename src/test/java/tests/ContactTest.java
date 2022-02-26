package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class ContactTest extends BaseTest{
    @Step("Open contact page and check error message")
    @Test(description = "Check error message invalid data.")
    public void CheckErrorMessage(){
        log.info("Open contact page and input invalid email.");
        contactPage
                .openContactPage()
                .titleContactVisible()
                .inputInvalidName()
                .inputInvalidEmail();
        log.info("Submit form.");
        contactPage
                .buttonSendClick();
        log.info("Check error message should be visible.");
        contactPage
                .errorInvalidEmailVisible()
                .errorInvalidSubmitVisible();
        AllureUtils.takeScreenshot();

    }
}
