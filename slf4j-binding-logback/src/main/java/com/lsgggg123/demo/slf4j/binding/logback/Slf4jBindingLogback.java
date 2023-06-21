package com.lsgggg123.demo.slf4j.binding.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingLogback {

    public static void main(String[] args) throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingLogback.class);
        logger.info("slf4j bind to logback classic.");

        // sleep to wait log output asynchronously
        Thread.sleep(100L);
    }
}
