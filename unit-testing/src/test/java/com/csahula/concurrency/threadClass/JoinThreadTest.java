package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Basic test uses a {@link Thread} class to join threads together.
 * Codes do not have a purpose. It is just for my study.
 */
public class JoinThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JoinThreadTest.class);

    @Test
    public void joinThreadTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

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
