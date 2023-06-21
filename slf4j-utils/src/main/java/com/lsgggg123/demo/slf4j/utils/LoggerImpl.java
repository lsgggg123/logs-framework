package com.lsgggg123.demo.slf4j.utils;

public enum LoggerImpl {
    JUL("org.slf4j.impl.JDK14LoggerFactory"),

    LOG4j("org.slf4j.imp.Log4jLoggerFactory"),

    LOG4J2("org.apache.logging.slf4j.Log4jLoggerFactory"),

    LOGBACK("ch.qos.logback.classic.util.ContextSelectorStaticBinder"),

    LOGEVENTS("org.logevents.LogEventFactory"),

    SLF4J_NOP("org.slf4j.helpers.NOPLoggerFactory"),

    SLF4J_SIMPLE("org.slf4j.impl.SimpleLoggerFactory"),

    UNKNOWN("");

    private final String loggerFactoryClassStr;

    LoggerImpl(String loggerFactoryClassStr) {
        this.loggerFactoryClassStr = loggerFactoryClassStr;
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }

    public static LoggerImpl getLoggerImplByClassStr(String clzStr) {
        if (clzStr == null) {
            return LoggerImpl.UNKNOWN;
        }

        for (LoggerImpl loggerImpl: values()) {
            if (loggerImpl.getLoggerFactoryClassStr().equals(clzStr)) {
                return loggerImpl;
            }
        }

        return LoggerImpl.UNKNOWN;
    }
}
