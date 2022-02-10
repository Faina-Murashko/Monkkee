package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntriesNewDataImgPage extends BasePage{
    public static final By INPUT_MESSAGE_TITLE = By.xpath("//div[@id='editable']");
    public static final By ADD_IMG = By.xpath("//div[@class='cke_inner']//*[@class='cke_button_icon cke_button__image_icon']");
    public static final By IMG_PROPERTIES_INPUT_URL_IMG = By.xpath(" //div[@role='presentation']//input[@class='cke_dialog_ui_input_text']");
    public static final By IMG_PROPERTIES = By.xpath("//div[@class='cke_dialog_body']");
    public static final By IMG_ALIGN_CENTER = By.xpath("//div[@role='radiogroup']//table[@role='presentation']//label[.='Center']");
    public static final By CLICK_BUTTON_OK_IMG_PROPERTIES = By.xpath("//div[@class='cke_dialog_body']//span[text()='OK']");
    public static final By INPUT_NEW_TAG = By.xpath("//div[@class='sidebar']//*[@id='new-tag']");

    @Step("Input message title.")
    public EntriesNewDataImgPage inputTitleText(){
        $(INPUT_MESSAGE_TITLE).sendKeys("Hello \n" + "");
        return new EntriesNewDataImgPage();
    }
    @Step("Click on button for add new image.")
    public EntriesNewDataImgPage clickImgButton(){
        $(ADD_IMG).click();
        return new EntriesNewDataImgPage();
    }
    @Step("Input message title.")
    public EntriesNewDataImgPage inputUrlImg(){
        $(IMG_PROPERTIES_INPUT_URL_IMG).sendKeys(
                "https://img-host.su/0c0dg.png");
        return new EntriesNewDataImgPage();
    }
    @Step("Properties should be visible.")
    public EntriesNewDataImgPage propertiesCheckVisible(){
        $(IMG_PROPERTIES).shouldBe(Condition.visible);
        return new EntriesNewDataImgPage();
    }
    @Step("IMG align center.")
    public EntriesNewDataImgPage choiceImgAlignCenter(){
        $(IMG_ALIGN_CENTER).click();
        return new EntriesNewDataImgPage();
    }
    @Step("Click submit img properties.")
    public EntriesNewDataImgPage submitImgProperties(){
        $(CLICK_BUTTON_OK_IMG_PROPERTIES).click();
        return new EntriesNewDataImgPage();
    }
    @Step("Add tags for this entries with img.")
    public EntriesNewDataImgPage addTagsName(){
        $(INPUT_NEW_TAG).sendKeys("Img_By-Url");
        return new EntriesNewDataImgPage();
    }
    @Step("Submit tag name.")
    public EntriesNewDataImgPage submitTagName(){
        $(INPUT_NEW_TAG).submit();
        return new EntriesNewDataImgPage();
    }
}

