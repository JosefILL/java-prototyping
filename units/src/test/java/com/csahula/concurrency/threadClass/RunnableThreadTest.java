package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

/**
 * Basic test uses a {@link Runnable} interface.
 * Codes do not have purpose. It is just for my study.
 */
public class RunnableThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunnableThreadTest.class);

    @Test
    public void startThreadTest() {

        Thread myThread = new Thread(new RunImplementations());

        long begin = System.currentTimeMillis();
        myThread.start();

        // Testing results
        try {
            myThread.join(); // Must be to wait for threadClass die
        } catch (InterruptedException e) {
            LOGGER.error("Join a thread failed.");
        }
        long end = System.currentTimeMillis();

        assertThat(((end - begin) / 1000), greaterThanOrEqualTo(5L));
    }

    class RunImplementations implements Runnable {

        public void run () {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exception) {
                LOGGER.error("Test stopped by an exception.", exception);
            }
        }
    }
}
