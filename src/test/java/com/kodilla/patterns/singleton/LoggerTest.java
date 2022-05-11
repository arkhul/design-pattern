package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {

    @Test
    void testGetFileName() {
        // given
        Logger logger = Logger.LOGGER_INSTANCE;
        logger.log("Some new log");

        // when
        String logName = logger.getLastLog();

        // then
        assertEquals(logName, "Some new log");
    }
}