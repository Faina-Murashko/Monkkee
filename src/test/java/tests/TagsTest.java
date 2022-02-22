package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Tags;
import models.TagsFactory;
import org.testng.annotations.Test;
import utils.AllureUtils;

@Log4j2
public class TagsTest extends BaseTest {
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
        log.info("Open tags page.");
        tagsPage
                .clickOnButtonManagerTags()
                .titleTagsShouldBeVisible()
                .buttonEditTags()
                .titleEditTagsShouldBeVisible()
                .clearTagName();
        log.info("Input random tags name.");
        Tags tags = TagsFactory.get();
        tagsModalPage.createNewNameTags(tags);
        tagsPage
                .clickOnButtonSubmit();
        AllureUtils.takeScreenshot();

    }
}
