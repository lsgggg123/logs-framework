package com.lsgggg123.demo.slf4j.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSimple {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jSimple.class);
        logger.info("slf4j simple");
        logger.debug("slf4j simple debug");
    }
}
