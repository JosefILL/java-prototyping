package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveCharTest {

    @Test
    public void comparingTest() {
        char charValue = 'T';

        boolean matchValue;
        if (charValue == 'T') {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Value T must match char variable", Boolean.TRUE, matchValue);
    }

    @Test
    public void intIntoCharTest() {

        char charIntValue = 64;
        char charValue = '@';

        boolean matchValue;
        if (charIntValue == charValue) {
            matchValue = true;
        } else {
            matchValue = false;
        }

        assertThat("The number 64 is for char @ in ASCII table.", matchValue, is(true));
    }

    @Test
    public void hexNumberIntoCharTest() {

        char charByDecimalNumber = 100;
        char charByHexNumber = '\u0064';

        boolean matchValue;
        if (charByDecimalNumber == charByHexNumber) {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Char is possible to pass as a HEX number", Boolean.TRUE, matchValue);
    }

    @Test
    public void negativeIntIntoCharTest() {

        char charNegativeValue = (char) -64;
        char chaPositiverValue = (char) 64;

        boolean matchValue;
        if (charNegativeValue == chaPositiverValue) {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Minus is ignored at retyping", Boolean.FALSE, matchValue);
    }
}