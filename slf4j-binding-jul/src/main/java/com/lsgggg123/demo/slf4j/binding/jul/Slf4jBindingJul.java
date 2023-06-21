package com.lsgggg123.demo.slf4j.binding.jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.logging.LogManager;

public class Slf4jBindingJul {

    static {
        try {
            InputStream inputStream = Slf4jBindingJul.class.getClassLoader().getResourceAsStream("logging.properties");
            LogManager logManager= LogManager.getLogManager();
            logManager.readConfiguration(inputStream);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingJul.class);
        logger.info("slf4j bind to java.util.logging");
    }
}
