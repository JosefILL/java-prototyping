package com.csahula.datatype;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing possibilities and using data type primitive char.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class DatatypePrimitiveCharTest {

    /**
     * NOTES:
     * - All chars have equivalent in number therefore it is possible pass convert int to char and vice versa.
     */

    @Test
    public void comparingPrimitiveCharTypeTest() {
        char charValue = 'T';

        boolean matchValue;
        if (charValue == 'T') {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Value T must match char varibale", Boolean.TRUE, matchValue);
    }

    @Test
    public void setIntIntoCharTest() {
        char charValue = 64;

        boolean matchValue;
        if (charValue == '@') {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Must match the number 64 is for char @ in ASCII table.", Boolean.TRUE, matchValue);
    }

    @Test
    public void setHexNumberIntoCharTest() {

        char charByDecimalNumber = 100;
        char charByHexNumber = '\u0064';

        boolean matchValue;
        if (charByDecimalNumber == charByHexNumber) {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("Must match char is possible to pass like HEX number.", Boolean.TRUE, matchValue);
    }

    @Test
    public void setNegativeIntIntoCharTest() {
        char charNegativeValue = (char) -64;
        char chaPositiverValue = (char) 64;

        boolean matchValue;
        if (charNegativeValue == chaPositiverValue) {
            matchValue = Boolean.TRUE;
        } else {
            matchValue = Boolean.FALSE;
        }

        assertEquals("After retyping negative int into char values can be same.", Boolean.FALSE, matchValue);
    }
}