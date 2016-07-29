package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class PrimitiveIntTest {

    @Test
    public void intRangeTest() {
        int minNumber = (int) Math.pow(2, 31) + 1;
        int maxNumber = (int) Math.pow(2, 31);

        assertThat(minNumber, is(Integer.MIN_VALUE));
        assertThat(maxNumber, is(Integer.MAX_VALUE));
    }
}
