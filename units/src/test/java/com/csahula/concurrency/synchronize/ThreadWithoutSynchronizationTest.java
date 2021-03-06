package com.csahula.concurrency.synchronize;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
public class ThreadWithoutSynchronizationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadWithoutSynchronizationTest.class);

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

        assertThat(account.getAmount(), lessThan(ACCOUNT_BALANCE));
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// POJO //////////////////////////////
    //////////////////////////////////////////////////////////////////

    class Account  {

        private Long amount = 0L;

        public Long getAmount() {
            return amount;
        }

        public void putOnAccount(Long amount) {
            this.amount += amount;
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
