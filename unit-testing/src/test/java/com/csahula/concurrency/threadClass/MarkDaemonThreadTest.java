package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class to mark a thread as daemon one.
 * Codes do not have purpose. It is just for my study.
 */
public class MarkDaemonThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarkDaemonThreadTest.class);

    @Test
    public void markDaemonThreadTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        // Testing results
        myThread.join(); // Must be to wait for threadClass die
        assertThat(myThread.isDaemon(), is(true));
    }

    private class MyThread extends Thread {

        public void run () {
            LOGGER.info("Task finished.");
        }
    }
}
