package com.gonzlem.testing.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "John", "Doe");
        owner.setCity("Ing. Maschwitz");
        owner.setTelephone("1154329877");

        assertAll("All properties set correctly",
                () -> assertAll("Person properties",
                        () -> assertEquals("John", owner.getFirstName(), "Incorrect first name"),
                        () -> assertEquals("Doe", owner.getLastName(), "Incorrect last name")),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Ing. Maschwitz", owner.getCity(), "Incorrect city"),
                        () -> assertEquals("1154329877", owner.getTelephone(), "Incorrect telephone")
                ));
    }

}