package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.EntriesNewDataPage;
import pages.EntriesPage;
import pages.LoginPage;
//import tests.base.TestListener;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
//@Listeners(TestListener.class)
public class BaseTest {

    LoginPage loginPage;
    EntriesPage entriesPage;
    EntriesNewDataPage entriesNewDataPage;
    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        loginPage = new LoginPage();
        entriesPage = new EntriesPage();
        entriesNewDataPage = new EntriesNewDataPage();
        Configuration.browser = "chrome";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");


    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown() {
//        getWebDriver().quit();
//    }
}
