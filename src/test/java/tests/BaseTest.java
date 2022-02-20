package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.*;
//import tests.base.TestListener;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
//@Listeners(TestListener.class)
public class BaseTest {

    LoginPage loginPage;
    EntriesPage entriesPage;
    EntriesNewDataPage entriesNewDataPage;
    EntriesNewDataImgPage entriesNewDataImgPage;
    EntriesSettingPage entriesSettingPage;
    HomePage homePage;
    @BeforeClass
    public void setUp() throws InterruptedException {
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
        homePage = new HomePage();
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
        getWebDriver().quit();
    }
}
