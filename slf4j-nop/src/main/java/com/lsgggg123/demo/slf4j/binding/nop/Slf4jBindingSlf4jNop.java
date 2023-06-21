package com.lsgggg123.demo.slf4j.binding.nop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingSlf4jNop {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingSlf4jNop.class);
        logger.info("Hello World");
    }
}