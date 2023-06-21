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
    }
}