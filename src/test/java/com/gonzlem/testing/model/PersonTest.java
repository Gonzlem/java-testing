package com.gonzlem.testing.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Grouped assertions can be good when we need to test multiple params/things in one run,
// in this example we test that all of our properties are being set correctly

class PersonTest {
    @Test
    void groupedAssertions() {
        // given I create a new person with:
        Person person = new Person(1l, "John", "Doe");

        // then I check all its properties are set correctly
        assertAll("Test person properties set correctly",
                () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsg() {
        // given I create a new person with:
        Person person = new Person(1l, "John", "Doeee");

        // then I check all its properties are set correctly
        assertAll("Test person properties set correctly",
                () -> assertEquals("John", person.getFirstName(), "First name set incorrectly"),
                () -> assertNotEquals("Doe", person.getLastName(), "Last name set incorrectly"));
    }
}