package com.csahula.concurrency.concurrentapi;

import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

/**
 * Basic test which runs a threadClass
 * Codes do not have purpose. It is just for my study.
 */
public class BasicThreadTest {

    /**
     * Shows how to run a threadClass by its class.
     *
     * TODO finish
     */
    @Test
    @Ignore
    public void executeThreadByClassTest() throws Exception {

        DataWrapper dataWrapper = new DataWrapper();


        // Tested code
        Runnable task = () -> {
            dataWrapper.setThreadName(Thread.currentThread().getName());
        };

        task.run();
        Thread thread = new Thread(task);
        thread.start();

        // Testing results
        assertThat(dataWrapper.getThreadName(), not(isEmptyOrNullString()));
    }

    /**
     * Shows how to run a threadClass by Concurrency API.
     */
    @Test
    @Ignore
    public void executeThreadByConcurrencyAPI() {

        DataWrapper dataWrapper = new DataWrapper();

        TestJob testJob = new TestJob();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(testJob);

        // Testing results
        assertThat(dataWrapper.getThreadName(), not(isEmptyOrNullString()));
    }

    private class TestJob implements Runnable {

        DataWrapper dataWrapper;

        @Override
        public void run() {
            dataWrapper.setThreadName(Thread.currentThread().getName());
        }

        public DataWrapper getDataWrapper() {
            return dataWrapper;
        }

        public void setDataWrapper(DataWrapper dataWrapper) {
            this.dataWrapper = dataWrapper;
        }
    }

    /**
     * Class for testing
     */
    private class DataWrapper {

        private String threadName;

        String getThreadName() {
            return threadName;
        }

        void setThreadName(String threadName) {
            this.threadName = threadName;
        }
    }
}
