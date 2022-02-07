package pages;

import com.codeborne.selenide.Condition;
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



    public EntriesNewDataPage clickOnCreateNewEntries(){
        $(CREATE_NEW_ENTRIES).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage clickButtonCancel(){
        $(BUTTON_CANCEL).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage checkToolBar(){
        $(CHECK_TOOL_BAR).shouldBe(Condition.visible);
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage inputMessageInNewEntries(){
        $(INPUT_MESSAGE_IN_NEW_ENTRIES)
                .sendKeys("Hello.\n" + "my name is Faina");
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage clickSaveEntries(){
        $(BUTTON_SAVE_ENTRIES).click();
        return new EntriesNewDataPage();
    }
    public EntriesNewDataPage clickOnButtonHomePage(){
        $(BUTTON_HOME_PAGE).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage choiceBoltFontOnOff(){
        $(TEXT_SELECTION_BOLD_FONT).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage visibilityFullToolBar(){
        $(FULL_REVEAL_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage centeredText(){
        $(CENTERED_TEXT_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }

    public EntriesNewDataPage turnToolBar(){
        $(TURN_TOOL_BAR).click();
        return new EntriesNewDataPage();
    }
}
