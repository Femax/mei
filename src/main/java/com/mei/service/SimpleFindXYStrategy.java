package com.mei.service;

import com.google.inject.Singleton;

@Singleton
public class SimpleFindXYStrategy implements FindXYStrategy {
    public String getMessage() {
        return "Hello World";
    }
}