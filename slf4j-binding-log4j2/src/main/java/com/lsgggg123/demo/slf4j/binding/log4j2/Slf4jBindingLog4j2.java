/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.lsgggg123.demo.slf4j.binding.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Slf4jBindingLog4j2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jBindingLog4j2.class);
    
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            LOGGER.info("scheduler invoked at fix rate");
        }, 1L, 3, TimeUnit.SECONDS);
    }
}