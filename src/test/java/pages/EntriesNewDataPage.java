package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntriesNewDataPage extends BasePage{
    public static final By CREATE_NEW_ENTRIES = By.xpath("//div[@class='btn-toolbar']/a/i[@class='icon-plus']");
    public static final By CHECK_TOOL_BAR = By.xpath("//div[@class='cke_top']");
    public static final By INPUT_MESSAGE_IN_NEW_ENTRIES = By.xpath("//div[@id='editable']");
    public static final By BUTTON_CANCEL = By.xpath("//div[@class='btn-text-content']");
    public static final By BUTTON_SAVE_ENTRIES = By.xpath("//span[@id='cke_1_toolbox']/span[5]//a[@title='Save']");
    public static final By BUTTON_HOME_PAGE = By.xpath("//a[@class='btn btn-primary']/*[@class='icon-home']");
    public static final By TEXT_SELECTION_BOLD_FONT = By.xpath("//*[@class='cke_toolgroup']/a/span[@class='cke_button_icon cke_button__bold_icon']");
    public static final By FULL_REVEAL_TOOL_BAR = By.xpath("//*[@class='cke_toolbar cke_toolbar_last']//span[@class='cke_toolgroup']/a/span[@class='cke_button_icon cke_button__show_complete_toolbar_icon']");
    public static final By CENTERED_TEXT_TOOL_BAR = By.xpath("//*[@class='cke_toolgroup']//span[@class='cke_button_icon cke_button__justifycenter_icon']");
    public static final By TURN_TOOL_BAR = By.xpath("//*[@class='cke_toolbox']//*[@id='cke_48']");
    public static final By TEXT_ALIGHT_LEFT = By.xpath("//div[@class='cke_inner']//span[@class='cke_button_icon cke_button__justifyleft_icon']");
    public static final By INPUT_NEW_TAG = By.xpath("//div[@class='sidebar']//*[@id='new-tag']");
    public static final By BUTTON_OK_TAG = By.xpath("//div[@class='input-group']//div[@class='btn-text-content']");


    @Step("Click on the button to create a new note.")
    public EntriesNewDataPage clickOnCreateNewEntries(){
        $(CREATE_NEW_ENTRIES).click();
        return new EntriesNewDataPage();
    }
    @Step("")
    public EntriesNewDataPage clickButtonCancel(){
        $(BUTTON_CANCEL).click();
        return new EntriesNewDataPage();
    }
    @Step("Find the text settings panel.")
    public EntriesNewDataPage checkToolBar(){
        $(CHECK_TOOL_BAR).shouldBe(Condition.visible);
        return new EntriesNewDataPage();
    }
    @Step("Enter a welcome title.")
    public EntriesNewDataPage inputMessageTitle(){
        $(INPUT_MESSAGE_IN_NEW_ENTRIES)
                .sendKeys("Hello.\n" + "my name is Faina\n" + "");

        return new EntriesNewDataPage();
    }
    @Step("Click on the 'save' button.")
    public EntriesNewDataPage clickSaveEntries(){
        $(BUTTON_SAVE_ENTRIES).click();
        return new EntriesNewDataPage();
    }
    @Step("Click on the 'Home' button and return to the home page.")
    public EntriesNewDataPage clickOnButtonHomePage(){
        $(BUTTON_HOME_PAGE).click();
        return new EntriesNewDataPage();
    }
    @Step("Turn on or turn off the 'Bold Text' setting.")
    public EntriesNewDataPage choiceBoltFontOnOff(){
        $(TEXT_SELECTION_BOLD_FONT).click();
        return new EntriesNewDataPage();
    }
    @Step("Fully expand the text settings panel.")
    public EntriesNewDataPage visibilityFullToolBar(){
        $(FULL_REVEAL_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }
    @Step("Select the text location in the center.")
    public EntriesNewDataPage centeredText(){
        $(CENTERED_TEXT_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }
    @Step("Collapse the text settings panel.")
    public EntriesNewDataPage turnToolBar(){
        $(TURN_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }
    @Step("Enter the text of our message.")
    public EntriesNewDataPage inputFullMessage(){
        $(INPUT_MESSAGE_IN_NEW_ENTRIES)
                .sendKeys("Today I will show my skills in testing this diary site.\n" +
                        "Thank you in advance for your time.");
        return new EntriesNewDataPage();
    }
    @Step("Choosing text layout on the left.")
    public EntriesNewDataPage textAlightLeft(){
        $(TEXT_ALIGHT_LEFT).click();
        return new EntriesNewDataPage();
    }
    @Step("Input tag name for entries.")
    public EntriesNewDataPage inputTagName(){
        $(INPUT_NEW_TAG).sendKeys("Testing");
        return new EntriesNewDataPage();
    }
    @Step("Submit name tag.")
    public EntriesNewDataPage clickButtonTags(){
        $(INPUT_NEW_TAG).click();
        return new EntriesNewDataPage();
    }
}
