package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveLongTest {

    @Test
    public void longInitializationTest() {

        long a = 2000L;
        long b = 2000l;

        assertThat("Primitive Long is defined with l suffix.", a, is(new Long(2000)));
        assertThat("No difference between capital L and lowercase L.", (a == b), is(Boolean.TRUE));
    }

    @Test
    public void testLongRange() {
        long minNumber = (long) Math.pow(2, 63) + 1;
        long maxNumber = (long) Math.pow(2, 63);

        assertThat(minNumber, is(Long.MIN_VALUE));
        assertThat(maxNumber, is(Long.MAX_VALUE));
    }
}
