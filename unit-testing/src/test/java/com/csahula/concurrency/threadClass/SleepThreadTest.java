package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class to asleep a thread.
 * Codes do not have a purpose. It is just for my study.
 */
public class SleepThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SleepThreadTest.class);

    @Test
    public void sleepThreadTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.start();


        // Testing results
        myThread.join(); // Must wait for a threadClass die to get a result
        assertThat(myThread.getRunningTime(), greaterThanOrEqualTo(10L));
    }

    private class MyThread extends Thread {

        long time = 0;

        public void run () {
            long begin = System.currentTimeMillis();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException exception) {
                LOGGER.error("Test stopped by an exception.", exception);
            }

            time = System.currentTimeMillis() - begin;
        }

        public long getRunningTime() {
            return (time / 1000);
        }
    }
}
