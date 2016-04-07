package com.csahula.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 *
 * Tests possibilities of arrays in Java programming language.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class ArrayTest {

    @Test
    public void testInitOneDimensionArray() {

        int[] sample1;
        int [] sample2;
        String sample3 [];

        sample1 = new int[3];
        sample2 = new int[0];
        sample3 = new String[3];

        // This form must¨be declare and initialize in one line
        int[] sample4 = {1, 4};

        assertThat(sample1.length, is(3));
        assertThat(sample2.length, is(0));
        assertThat(sample3.length, is(3));
        assertThat(sample4.length, is(2));
    }

    @Test
    public void testInitMoreDimensionsArray() {

        int[][] sample1 = new int[3][];
        sample1[1] = new int[4];

        int[][] sample2 = {{1, 2}, {5}, {7, 6, 7}};

        assertThat(sample1.length, is(3));
        assertThat(sample1[1].length, is(4));
        assertThat(sample2[0].length, is(2));
    }

    @Test
    public void testFillingArray() {

        int[] tens = new int[9];
        for (int number : tens) {
            assertThat("Default value of int is 0.", number, is(0));
        }

        for (int index=0,i=10;i<=90;index++,i+=10) {
            tens[index] = i;
        }

        assertThat("First index of array is 0.", tens[0], is(10));
        assertThat(tens[8], is(90));
    }

    @Test
    public void testGetsNotExistedItem() {

        String[] namesInBatch = new String[50];

        boolean throwException = false;
        try {
            String particularName = namesInBatch[90];
        } catch (ArrayIndexOutOfBoundsException e) {
            throwException = true;
        }

        assertThat(throwException, is(true));
    }
}
