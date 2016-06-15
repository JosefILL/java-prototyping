package com.csahula.concurrency.threadClass;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

/**
 * Basic test uses a {@link Thread} class to get list of running threads in a group.
 * Codes do not have a purpose. It is just for my study.
 */
public class IterateThreadsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(IterateThreadsTest.class);

    @Test
    public void iterateThreadTest() throws Exception {

        final String THREAD_NAME = "RunImplementations";

        // Start another threadClass
        MyThread myThread = new MyThread(THREAD_NAME);
        myThread.start();

        // Get count and collects names
        Thread[] threads = new Thread[Thread.activeCount()];
        int countInGroups = Thread.enumerate(threads);

        List<String> threadNames = new ArrayList();
        for (Thread thread : threads) {
            threadNames.add(thread.getName());
        }

        // Testing results
        assertThat(threadNames, hasSize(countInGroups));
        assertThat(threadNames, hasItem(THREAD_NAME));
    }

    class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        private final long LOOPS = 1000;

        public void run () {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                LOGGER.error("Test stopped by an exception.", exception);
            }
        }
    }
}
