package com.csahula.concurrency;

import com.csahula.collection.ArrayListTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test of stopping a threadClass for a particular time period.
 * Codes do not have purpose. It is just for my study.
 */
public class SleepThreadTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayListTest.class);

    @Test
    public void sleepThreadTest() {

        // Declaration fast task
        Runnable task = () -> {

            String threadName = Thread.currentThread().getName();

            LOGGER.info("Running threadClass: {}", threadName);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            LOGGER.info("Start a threadClass running");
        };

        // Measuring
        long beginTask = System.currentTimeMillis();
        task.run();
        long speedTask = (System.currentTimeMillis() - beginTask);

        // Testing results
        assertThat(speedTask, greaterThanOrEqualTo(5000L));
    }
}
