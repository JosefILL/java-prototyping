package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveByteTest {

    @Test
    public void getByteRangeTest() {

        byte minByteNumber = findMinimumNumberOfPrimitiveByte((byte) 0);
        byte maxByteNumber = findMaximalNumberOfPrimitiveByte((byte) 0);

        assertThat(minByteNumber, is(((byte) -128)));
        assertThat(maxByteNumber, is(((byte)127)));
    }

    @Test
    public void summingReturnsIntegerTest() {

        byte a = 5;
        byte b = 10;

        assertThat("Result of summing is primitive integer.", ((Object)(a + b)).getClass().getName(), is(Integer.class.getName()));
    }

    @Test
    public void summingReturnByteTest() {

        byte a = 5;
        byte b = 10;

        byte c = (byte) (a + b);

        assertThat("To get a byte from summing you must retype it.", c, is(((byte) 15)));
    }


    @Test(expected=NumberFormatException.class)
    public void stringToByteTest() {
        Byte.parseByte("128");
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// HELPERS ///////////////////////////
    //////////////////////////////////////////////////////////////////

    /**
     * Returns maximum number of byte
     */
    private byte findMaximalNumberOfPrimitiveByte(byte number) {
        number = sumPrimitiveByte(number, (byte) 1);
        if (number < 0) {
            return (byte) (number - 1);
        }
        return findMaximalNumberOfPrimitiveByte(number);
    }

    /**
     * Returns minimum number of byte
     */
    private byte findMinimumNumberOfPrimitiveByte(byte number) {
        number = sumPrimitiveByte(number, (byte) 1);
        if (number < 0) {
            return number;
        }
        return findMinimumNumberOfPrimitiveByte(number);
    }

    /**
     * Sum two byte numbers
     */
    private byte sumPrimitiveByte(byte a, byte b) {
        return (byte) (a + b);
    }

}
