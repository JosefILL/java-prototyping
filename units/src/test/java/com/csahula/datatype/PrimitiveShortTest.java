package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveShortTest {

    @Test
    public void testShortRange() {
        short minNumber = (short) Math.pow(2, 15);
        short maxNumber = (short) (((short) Math.pow(2, 15)) - 1);

        assertThat(minNumber, is(Short.MIN_VALUE));
        assertThat(maxNumber, is(Short.MAX_VALUE));
    }
}
