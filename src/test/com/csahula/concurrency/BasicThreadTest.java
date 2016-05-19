package com.csahula.concurrency;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test which runs a thread
 * Codes do not have purpose. It is just for my study.
 */
public class BasicThreadTest {

    @Test
    public void startThread() throws Exception {

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
