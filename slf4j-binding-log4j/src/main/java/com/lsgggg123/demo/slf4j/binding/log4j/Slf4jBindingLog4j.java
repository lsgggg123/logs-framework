package com.lsgggg123.demo.slf4j.binding.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingLog4j {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingLog4j.class);
        logger.info("slf4j bind to log4j.");
    }
}
