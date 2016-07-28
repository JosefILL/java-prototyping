package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveNumberTest {

    @Test
    public void sumByteTest() {

        byte a = 5;
        byte b = 10;

        assertThat("It throws exception because of 128 is byte's out of range.",
                ((Object)(a + b)).getClass().getName(), is(Integer.class.getName()));
    }

    @Test
    public void stringToByteTest() {

        boolean throwException = false;

        String byteValue = "128";
        try {
            Byte.parseByte(byteValue);
        } catch (NumberFormatException e) {
            throwException = true;
        }

        assertThat("It throws exception because of 128 is byte's out of range.",
                throwException, is(true));
    }

    @Test
    public void testRangeByte() {

        byte minByteNumber = findMinimumNumberOfPrimitiveByte((byte) 0);
        byte maxByteNumber = findMaximalNumberOfPrimitiveByte((byte) 0);

        assertThat(minByteNumber, is(((byte) -128)));
        assertThat(maxByteNumber, is(((byte)127)));
    }

    @Test
    public void testShortRange() {
        short minNumber = (short) Math.pow(2, 15);
        short maxNumber = (short) (((short) Math.pow(2, 15)) - 1);

        assertThat(minNumber, is(Short.MIN_VALUE));
        assertThat(maxNumber, is(Short.MAX_VALUE));
    }

    @Test
    public void testIntRange() {
        int minNumber = (int) Math.pow(2, 31) + 1;
        int maxNumber = (int) Math.pow(2, 31);

        assertThat(minNumber, is(Integer.MIN_VALUE));
        assertThat(maxNumber, is(Integer.MAX_VALUE));
    }

    @Test
    public void longDefinitionTest() {
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
