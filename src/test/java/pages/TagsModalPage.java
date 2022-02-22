package pages;

import elements.Input;
import lombok.extern.log4j.Log4j2;
import models.Account;
import models.Tags;
@Log4j2
public class TagsModalPage extends BasePage {
    public TagsPage createNewNameTags(Tags tags) {
        log.info("Create label for input name tags with faker.");
        new Input(driver, "Tags").writeTags(tags.getTags());
        return new TagsPage();
    }
}
