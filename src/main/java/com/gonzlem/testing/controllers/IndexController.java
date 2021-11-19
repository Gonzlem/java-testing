package com.gonzlem.testing.controllers;

import com.gonzlem.testing.exceptions.ValueNotFoundException;

public class IndexController {

    public String index() {

        return "index";
    }

    public String oupsHandler() {
        throw new ValueNotFoundException();
    }
}
