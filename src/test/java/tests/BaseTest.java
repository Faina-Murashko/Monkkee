package tests;

import com.codeborne.selenide.Configuration;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
@Log4j2
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    EntriesPage entriesPage;
    EntriesNewDataPage entriesNewDataPage;
    EntriesNewDataImgPage entriesNewDataImgPage;
    EntriesSettingPage entriesSettingPage;
    HomePage homePage;
    BlogPage blogPage;
    RegistrationPage registrationPage;
    RegistrationModalPage registrationModalPage;
    TagsPage tagsPage;
    TagsModalPage tagsModalPage;
    DonationPage donationPage;
    AuthorModalPage authorModalPage;
    @BeforeClass
    public void setUp() {
        log.info("Open browser.");
        if (browser.equals("chrome")) {
            browser = "chrome";
        } else if (browser.equals("firefox")) {
            browser = "firefox";
        } else if (browser.equals("edge")) {
            browser = "edge";
        }
        loginPage = new LoginPage();
        entriesPage = new EntriesPage();
        entriesNewDataPage = new EntriesNewDataPage();
        entriesNewDataImgPage = new EntriesNewDataImgPage();
        entriesSettingPage = new EntriesSettingPage();
        registrationPage = new RegistrationPage();
        registrationModalPage = new RegistrationModalPage();
        authorModalPage = new AuthorModalPage();
        tagsModalPage = new TagsModalPage();
        donationPage = new DonationPage();
        tagsPage = new TagsPage();
        homePage = new HomePage();
        blogPage = new BlogPage();
        browser = "chrome";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");


    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        log.info("Close browser.");
        getWebDriver().quit();
    }
}
