package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {
    static Faker faker = new Faker();

    public static Account get() {
        log.info("Building java faker to randomly enter email.");
        return Account.builder()
                .email(faker.internet().emailAddress())
                .build();
    }


}
