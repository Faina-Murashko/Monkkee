package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class Input {
    String inputLocator = "/html//input[@id='registration_email']";
    String inputTagsLocator = "//input[@id='tag']";
    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label){
        log.info("Setting a locator to enter a value.");
        this.driver = driver;
        this.label = label;
    }
    public void write(String text) {
        log.info("Write random email in the input");
        $(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }
    public void writeTags(String text) {
        log.info("Write random email in the input");
        $(By.xpath(String.format(inputTagsLocator, this.label))).sendKeys(text);
    }
}
