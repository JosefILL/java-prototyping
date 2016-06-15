package com.csahula.concurrency.threadClass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Basic test uses a {@link Thread} class to start a thread.
 * Codes do not have purpose. It is just for my study.
 */
public class BasicThreadTest {

    @Test
    public void startThreadTest() throws Exception {

        MyThread myThread = new MyThread();
        myThread.start();


        // Testing results
        myThread.join(); // Must be to wait for threadClass die
        assertThat(myThread.isState(), is(true));
    }

    class MyThread extends Thread {

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
