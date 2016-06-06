package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class to test if a threadClass is alive.
 * Codes do not have a purpose. It is just for my study.
 */
public class IsThreadAliveTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(IsThreadAliveTest.class);

    @Test
    public void isAliveThreadTest() {

        MyThread myThread = new MyThread();
        myThread.start();

        while (myThread.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                LOGGER.error("Error at running a tread");
            }
        }

        // Testing results
        assertThat(myThread.isAlive(), is(false));
    }

    class MyThread extends Thread {

        private final long LOOPS = 1000;

        public void run () {
            for (long i = 0; i < LOOPS; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException exception) {
                    LOGGER.error("Test stopped by an exception.", exception);
                }
            }

            LOGGER.info("Task finished");
        }
    }
}
