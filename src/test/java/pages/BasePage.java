package pages;

import utils.PropertyReader;
import com.codeborne.selenide.Configuration;


public class BasePage {
    String email, password;


    public BasePage() {
        Configuration.baseUrl = System.getenv().getOrDefault("MONKKEE_URL", PropertyReader.getProperty("monkkee.url"));
        email = System.getenv().getOrDefault("MONKKEE_EMAIL", PropertyReader.getProperty("monkkee.email"));
        password = System.getenv().getOrDefault("MONKKEE_PASSWORD", PropertyReader.getProperty("monkkee.password"));
    }
}