package com.csahula.concurrency.scheduling;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
/*
public class ThreadSchedulingByPriorityTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadSchedulingByPriorityTest.class);

    private final static Long ACCOUNT_BALANCE = 129999700000L;

    @Test
    public void unsynchronzedTest() throws InterruptedException {

        Account account = new Account();

        PaymentRegular regularPayment = new PaymentRegular("Payment regular", account);
        PaymentOrder regularOrder = new PaymentOrder("Payment order", account);

        regularPayment.start();
        regularOrder.start();

        // Testing results

        // Must be to wait for threadClass die
        regularPayment.join();
        regularOrder.join();

        assertThat(account.getAmount(), is(ACCOUNT_BALANCE));
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// POJO //////////////////////////////
    //////////////////////////////////////////////////////////////////

    class Account  {

        private List<String> threads;

        public List<String> getThreads() {
            return threads;
        }

        synchronized public void putOnAccount(String threadName) {
            threads.add(threadName);
        }
    }

    private class PaymentOrder extends Thread {

        private Account account;

        public PaymentOrder(String name, Account account) {
            super(name);
            this.account = account;
        }

        public void run () {
            long loops = 500000L;
            for (long i = 0; i < loops; i++) {
                account.putOnAccount(i);
            }
        }
    }

    private class PaymentRegular extends Thread {

        private Account account;

        public PaymentRegular(String name, Account account) {
            super(name);
            this.account = account;
        }

        public void run () {
            long loops = 100000L;
            for (long i = 0; i < loops; i++) {
                account.putOnAccount(i);
            }
        }
    }
}
*/