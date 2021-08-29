package com.lsgggg123.demo.slf4j.binding.jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingJul {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingJul.class);
        logger.info("slf4j bind to java.util.logging");
    }
}
