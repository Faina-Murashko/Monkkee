package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class Input {
    String inputLocator = "/html//input[@id='registration_email']";
    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }
    public void write(String text) {
        log.info("Write the text in the input field by the specified name ");
        $(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }
}
