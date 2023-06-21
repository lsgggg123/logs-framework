package com.lsgggg123.demo.slf4j.binding.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingSlf4jSimple {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingSlf4jSimple.class);
        logger.info("slf4j simple");
        logger.debug("slf4j simple debug");
    }
}
