package com.gonzlem.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// This tests can be ran with the UI from intelliJ or with
// the command line: mvn test

class GreetingTest {
    private Greeting greeting;

    // Runs before all tests start (class level)
    @BeforeAll
    static void beforeAll() {
        System.out.println("Ran before any of the tests started -> only called once");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Ran when every test finished -> only called once");
    }

    // Initialize the object before each test runs (before each => method level)
    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    // Runs every time each test finishes (method level)
    @AfterEach
    void tearDown() {
        System.out.println("Ran after finished method...");
    }

    @Test
    void helloWorld() {
        String answer = greeting.helloWorld();
        assertEquals("Hello World", answer);
    }

    @Test
    void testHelloWorld() {
        String answer = greeting.helloWorld("Emiliano");
        assertEquals("Hello Emiliano", answer);
    }
}