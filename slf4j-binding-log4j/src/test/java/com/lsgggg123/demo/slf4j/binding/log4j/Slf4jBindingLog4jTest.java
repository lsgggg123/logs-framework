package com.lsgggg123.demo.slf4j.binding.log4j;

import com.lsgggg123.demo.slf4j.utils.LoggerImpl;
import com.lsgggg123.demo.slf4j.utils.Slf4jUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Slf4jBindingLog4jTest {
    @Test
    public void test() {
        LoggerImpl loggerImpl = Slf4jUtils.getLoggerImpl();
        assertEquals(loggerImpl, LoggerImpl.LOG4j);
    }
}