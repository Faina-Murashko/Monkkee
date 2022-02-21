package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage extends BasePage{
    public static final By TITLE_BLOG = By.xpath("//div[@class='inner']/h1[text()='Blog']");
    public static final By DOG_FOOD_LINK = By.xpath("//div[@class='post-body']//a");
    public static final By DOG_FOOD_TITLE = By.xpath("//section[@class='blog']//h1[text()='Eating your own dog food']");
    public static final By DOG_FOOD_LINK_WIKI = By.xpath("//div[@class='post-body']//a");
    public static final By WIKI_TITLE = By.xpath("//h1[@id='firstHeading']");
    public static final By FORGET_TITLE = By.xpath("//div[@class='post post-single']//a[text()='Why you must never forget your monkkee password!!']");
    public static final By IMG_PASSWORD_POLICY = By.xpath("//div[@class='row']//div[@class='post-body']/p[4]/img");
    public static final By LINK_PASSWORD_REMINDER = By.xpath("//div[@class='post-body']//a[text()='Send password reminder']");
    public static final By TITLE_PASSWORD_REMINDER = By.xpath("//div[@class='content-container']/h1");
    public static final By INPUT_EMAIL = By.xpath("//input[@id='email']");
    public static final By AFTER_INPUT_EMAIL_MESSAGE = By.xpath("//div[@id='main']//p");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='help-block']");

    public BlogPage openBlogPage(){
        open("https://www.monkkee.com/en/blog/");
        return new BlogPage();
    }
    public BlogPage checkTitleBlogVisible(){
        $(TITLE_BLOG).shouldBe(Condition.visible);
        return new BlogPage();
    }
    public BlogPage dogFoodLinkCheck(){
        $(DOG_FOOD_LINK).click();
        return new BlogPage();
    }
    public BlogPage dogFoodTitleCheckVisible(){
        $(DOG_FOOD_TITLE).shouldBe(Condition.visible);
        return new BlogPage();
    }
    public BlogPage dogFoodLinkWiki(){
        $(DOG_FOOD_LINK_WIKI).click();
        return new BlogPage();
    }
    public BlogPage checkWikiTitleAboutDog(){
        $(WIKI_TITLE).shouldBe(Condition.visible);
        return new BlogPage();
    }
    public BlogPage checkTitleForgetPasswordVisible(){
        $(FORGET_TITLE).shouldBe(Condition.visible);
        $(FORGET_TITLE).click();
        return new BlogPage();
    }
    public BlogPage imgPasswordPolicyVisibleCheck(){
        $(IMG_PASSWORD_POLICY).shouldBe(Condition.visible);
        return new BlogPage();

    }
    public BlogPage linkPasswordReminder(){
        $(LINK_PASSWORD_REMINDER).shouldBe(Condition.visible).click();
        return new BlogPage();
    }
    public BlogPage titlePasswordReminderShouldHave(){
        $(TITLE_PASSWORD_REMINDER).should(Condition.text("Send yourself a password reminder"));
        return new BlogPage();
    }
    public BlogPage inputVariableEmailPasswordReminder(){
        $(INPUT_EMAIL).setValue("motoekip.borisov@gmail.com").submit();
        return new BlogPage();
    }
    public BlogPage checkMessageAfterInputVariableEmail(){
        $(AFTER_INPUT_EMAIL_MESSAGE)
                .should(Condition.text("If the email address you entered is recognised, an email with a password hint will be sent to it."));
        return new BlogPage();
    }
    public BlogPage inputInvalidEmailPasswordReminder(){
        $(INPUT_EMAIL).setValue("ajshvgbajenv").submit();
        return new BlogPage();
    }
    public BlogPage checkErrorMessageInvalidEmail(){
        $(ERROR_MESSAGE)
                .should(Condition.text("Not a valid email address"));
        return new BlogPage();
    }
}
