package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthorFactory {
    static Faker faker = new Faker();
    public static Author get(){
        log.info("Building java faker to randomly enter name, email, text for comment.");
        return Author.builder()
                .name(faker.name().fullName())
                .comment(faker.lebowski().character())
                .email(faker.internet().emailAddress())
                .build();

    }

}
