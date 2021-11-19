package com.gonzlem.testing.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

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

    // This one takes the whole 5s of time, it runs the code and after that it returns if it times out
    @DisplayName("Timeout testing example") // Example
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
        });
        System.out.println("It gets here");
    }

    // Takes only the 100 ms of timeout, if it passes that, it won't continue.
    @DisplayName("Preemptive timeout testing example")
    @Test
    void testPreemptiveTimeout() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
        });
        System.out.println("Never gets here");
    }
}