package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.*;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
@Log4j2
public class BaseTest {

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
    ContactPage contactPage;
    @Parameters
    @BeforeClass
    public void setUp(@Optional("chrome") String browser) {
        log.info("Open browser.");
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            Configuration.browserPosition = "0x0";
            options.addArguments("--disable-notifications");
        } else if ( browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            Configuration.browserPosition = "0x0";
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
        } else if (browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            Configuration.browserPosition = "0x0";
            options.addArguments("--disable-notifications");
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
        contactPage = new ContactPage();
        tagsPage = new TagsPage();
        homePage = new HomePage();
        blogPage = new BlogPage();
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;


    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        log.info("Close browser.");
        getWebDriver().quit();
    }
}
