package pages;

import org.openqa.selenium.WebDriver;
import utils.PropertyReader;
import com.codeborne.selenide.Configuration;


public class BasePage {
    String email, password;
    WebDriver driver;


    public BasePage() {
        Configuration.baseUrl = System.getenv().getOrDefault("MONKKEE_URL", PropertyReader.getProperty("monkkee.url"));
        email = System.getenv().getOrDefault("MONKKEE_EMAIL", PropertyReader.getProperty("monkkee.email"));
        password = System.getenv().getOrDefault("MONKKEE_PASSWORD", PropertyReader.getProperty("monkkee.password"));
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}