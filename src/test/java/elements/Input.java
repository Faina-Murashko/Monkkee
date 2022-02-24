package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class Input {
    String inputLocator = "/html//input[@id='registration_email']";
    String inputTagsLocator = "//input[@id='tag']";
    String inputAuthorLocator = "//input[@id='author']";
    String inputComment = "//textarea[@id='comment']";
    String inputEmail = "//input[@id='email']";
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
        log.info("Write random tags in the input");
        $(By.xpath(String.format(inputTagsLocator, this.label))).sendKeys(text);
    }
    public void writeAuthorName(String text) {
        log.info("Write random name in the input");
        $(By.xpath(String.format(inputAuthorLocator, this.label))).sendKeys(text);
    }
    public void writeComment(String text) {
        log.info("Write random comment in the input");
        $(By.xpath(String.format(inputComment, this.label))).sendKeys(text);
    }
    public void writeinputEmail(String text) {
        log.info("Write random email in the input");
        $(By.xpath(String.format(inputEmail, this.label))).sendKeys(text);
    }
}
