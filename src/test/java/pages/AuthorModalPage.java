package pages;

import elements.Input;
import lombok.extern.log4j.Log4j2;
import models.Author;
import models.Tags;
@Log4j2
public class AuthorModalPage extends BasePage{
    public DonationPage inputName(Author author) {
        log.info("Create label for input name tags with faker.");
        new Input(driver, "Name").writeAuthorName(author.getName());
        return new DonationPage();
    }
    public DonationPage createComment(Author author) {
        log.info("Create label for input name tags with faker.");
        new Input(driver, "Comment").writeComment(author.getComment());
        return new DonationPage();
    }
    public DonationPage inputEmail(Author author) {
        log.info("Create label for input name tags with faker.");
        new Input(driver, "Email").writeinputEmail(author.getEmail());
        return new DonationPage();
    }
}
