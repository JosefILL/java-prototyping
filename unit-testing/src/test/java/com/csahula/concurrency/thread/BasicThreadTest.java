package com.csahula.concurrency.thread;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class
 * Codes do not have purpose. It is just for my study.
 */
public class BasicThreadTest {

    /**
     * Shows how to run a thread by its class.
     */
    @Test
    public void executeThreadByClassTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.start();


        // Testing results
        myThread.join(); // Must be to wait for thread die
        assertThat(myThread.isState(), is(true));
    }

    class MyThread extends Thread
    {

        boolean state = false;

        public void run ()
        {
            state = true;
        }

        public boolean isState() {
            return state;
        }
    }
}
