package com.johnhayad.tarneeb;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] _args) {
        PropertyConfigurator.configure(Application.class.getClassLoader().getResource("log4j.properties"));
        log.info("Hello world!");
    }

    private Application() {}
}
