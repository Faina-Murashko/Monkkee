package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;
import com.codeborne.selenide.Configuration;

@Log4j2
public class BasePage {
    String email, password;
    WebDriver driver;


    public BasePage() {
        log.info("Here we created configuration for signup in order to enter.");
        Configuration.baseUrl = System.getenv().getOrDefault("MONKKEE_URL", PropertyReader.getProperty("monkkee.url"));
        email = System.getenv().getOrDefault("MONKKEE_EMAIL", PropertyReader.getProperty("monkkee.email"));
        password = System.getenv().getOrDefault("MONKKEE_PASSWORD", PropertyReader.getProperty("monkkee.password"));
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}