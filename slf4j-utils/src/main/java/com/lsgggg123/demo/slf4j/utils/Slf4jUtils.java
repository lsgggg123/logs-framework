package com.lsgggg123.demo.slf4j.utils;

import org.slf4j.spi.LoggerFactoryBinder;

import java.lang.reflect.Method;

public final class Slf4jUtils {

    private Slf4jUtils() {
        throw new AssertionError();
    }

    private static final String STATIC_LOGGER_BINDER = "org.slf4j.impl.StaticLoggerBinder";

    public static LoggerImpl getLoggerImpl() {
        try {
            Class<?> clz = Class.forName(STATIC_LOGGER_BINDER);
            Method method = clz.getDeclaredMethod("getSingleton");
            Object instance = method.invoke(null);
            LoggerFactoryBinder loggerFactoryBinder = (LoggerFactoryBinder) instance;
            String loggerFactoryClassStr = loggerFactoryBinder.getLoggerFactoryClassStr();
            return LoggerImpl.getLoggerImplByClassStr(loggerFactoryClassStr);
        } catch (Exception e) {
            return LoggerImpl.UNKNOWN;
        }

    }
}
