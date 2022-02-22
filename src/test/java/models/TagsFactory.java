package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TagsFactory {
    static Faker faker = new Faker();

    public static Tags get() {
        log.info("Input random name tags with java faker.");
        return Tags.builder()
                .tags(faker.hobbit().character())
                .build();

    }
}
