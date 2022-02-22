package pages;

import elements.Input;
import lombok.extern.log4j.Log4j2;
import models.Account;
@Log4j2
public class RegistrationModalPage extends BasePage{
    public RegistrationPage createWithFakeEmail(Account account){
        log.info("Create label for input email with faker.");
        new Input(driver, "Email").write(account.getEmail());
        return new RegistrationPage();

    }
}
