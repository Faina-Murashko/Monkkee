package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Author;
import models.AuthorFactory;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class DonationTest extends BaseTest{
    @Step("Open donations page.")
    @Test(description = "Open donation page and input 5 euro donation.")
    public void DonationsEuro() {
        log.info("Open donations page.");
        donationPage
                .openDonationPage()
                .titleDonationShouldBeVisible()
                .logoEuroShouldHaveText();
        log.info("Input 5 euro donations.");
        donationPage
                .input5Euro()
                .logoPayPalShouldBeVisible();
    }
    @Step("Open donations page and send comment with validation email.")
    @Test(description = "Open donation page and send comment.")
    public void DonationsComment() {
        log.info("Open donations page.");
        donationPage
                .openDonationPage()
                .titleDonationShouldBeVisible()
                .logoEuroShouldHaveText();
        Author author = AuthorFactory.get();
        log.info("Input random name.");
        authorModalPage
                .inputName(author);
        log.info("Input random email.");
        authorModalPage
                .inputEmail(author);
        log.info("Input random comment.");
        authorModalPage
                .createComment(author);
        log.info("check title visible");
        donationPage
                .titleDonationShouldBeVisible();



    }
    @Step("Open donations page and send comment with invalid email.")
    @Test(description = "Open donation page and send comment.")
    public void DonationsCommentInvalidEmail() {
        log.info("Open donations page.");
        donationPage
                .openDonationPage()
                .titleDonationShouldBeVisible()
                .logoEuroShouldHaveText();
        Author author = AuthorFactory.get();
        log.info("Input random name.");
        authorModalPage
                .inputName(author);
        log.info("Input invalid email.");
        donationPage
                .inputInvalidEmail();
        log.info("Input random comment.");
        authorModalPage
                .createComment(author)
                .submitFormComment();
        log.info("check error message.");
        donationPage
                .errorMessageInvalidEmail();
        AllureUtils.takeScreenshot();


    }
    @Step("Open donations page and send comment with invalid name and email.")
    @Test(description = "Open donation page and send comment.")
    public void DonationsCommentInvalidName() {
        log.info("Open donations page.");
        donationPage
                .openDonationPage()
                .titleDonationShouldBeVisible()
                .logoEuroShouldHaveText();
        Author author = AuthorFactory.get();
        log.info("Input invalid name.");
        donationPage
                .inputInvalidName();
        log.info("Input invalid email.");
        donationPage
                .inputInvalidEmail();
        log.info("Input random comment.");
        authorModalPage
                .createComment(author)
                .submitFormComment();
        log.info("check error message.");
        donationPage
                .errorMessageInvalidEmailAndName();
        AllureUtils.takeScreenshot();


    }


}
