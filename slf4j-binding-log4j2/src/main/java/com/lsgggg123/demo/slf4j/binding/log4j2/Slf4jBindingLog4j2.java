/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.lsgggg123.demo.slf4j.binding.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jBindingLog4j2 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jBindingLog4j2.class);
        logger.info("scheduler invoked at fix rate");

        if (logger.isDebugEnabled()) {
            logger.debug("debug");
            logger.debug("debug,{}", "abc");
        }

        if (logger.isInfoEnabled()) {
            logger.info("info");
            logger.info("info,{}", "123");
        }

        if (logger.isErrorEnabled()) {
            logger.error("error");
            logger.error("error,{}", "456");
            logger.error("error,{}", "456", new RuntimeException());
        }

        System.out.println("123");
    }
}