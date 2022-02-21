package pages;

import elements.Input;
import models.Account;

public class RegistrationModalPage extends BasePage{
    public RegistrationPage createWithFakeEmail(Account account){
        new Input(driver, "Email").write(account.getEmail());
        return new RegistrationPage();

    }
}
