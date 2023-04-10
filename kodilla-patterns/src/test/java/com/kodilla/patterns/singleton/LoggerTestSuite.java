package com.kodilla.patterns.singleton;
;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLog(){
        logger = Logger.INSTANCE;
        logger.log("log log");
    }
    @Test
    void getLastLogTest(){

        // when
        String lastLog = logger.getLastLog();

        // then
        assertEquals("log log",lastLog);

    }
}
