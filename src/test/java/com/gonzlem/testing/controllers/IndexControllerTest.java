package com.gonzlem.testing.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// jUnit5 lets us pass lambda expressions to handle complex errors as well
class IndexControllerTest {
    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
//        assertEquals("indexs", controller.index(), "Wrong view returned");
//        assertEquals("indexs", controller.index(), () -> "Wrong view returned (with lambda expression error)");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive message to build for my test");
//        assertTrue("failure".equals(controller.oupsHandler()), () -> "This is some expensive message to build for my test");

    }
}