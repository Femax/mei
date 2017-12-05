package com.mei.config;

import com.google.inject.AbstractModule;
import com.mei.service.SimpleFindXYStrategy;
import com.mei.service.FindXYStrategy;


public class AppInjector extends AbstractModule {
    protected void configure() {
        bind(FindXYStrategy.class).to(SimpleFindXYStrategy.class);
    }
}