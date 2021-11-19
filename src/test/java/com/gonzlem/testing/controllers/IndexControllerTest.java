package com.gonzlem.testing.controllers;

import com.gonzlem.testing.exceptions.ValueNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// jUnit lets us change the name it displays when it comes to running our tests.
// it is a really nice feature to have, mainly because it makes it easier to understand what's being
// tested.

// It is also important for the "test reports", so they pick a meaningful display name
class IndexControllerTest {
    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Test index controller returns proper view 💻") // Example
    @Test
    void index() {
        assertEquals("index", controller.index());
//        assertEquals("indexs", controller.index(), "Wrong view returned");
//        assertEquals("indexs", controller.index(), () -> "Wrong view returned (with lambda expression error)");
    }

    @DisplayName("Test index controller returns proper 'exception' ☠")
    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oupsHandler();
        });
    }
}