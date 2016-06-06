package com.csahula.concurrency.thread;

import com.csahula.collection.ArrayListTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class.
 * Codes do not have a purpose. It is just for my study.
 */
public class SleepThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SleepThreadTest.class);

    /**
     * Shows how to asleep a thread.
     */
    @Test
    public void executeThreadByClassTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.start();


        // Testing results
        myThread.join(); // Must wait for a thread die to get a result
        assertThat(myThread.getRunningTime(), greaterThanOrEqualTo(10L));
    }

    class MyThread extends Thread
    {

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
