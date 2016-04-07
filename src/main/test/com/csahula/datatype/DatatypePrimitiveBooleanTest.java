package com.csahula.datatype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing possibilities and using primitive boolean data type.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class DatatypePrimitiveBooleanTest {

    /**
     * NOTES:
     * We must initialize variable before using.
     * We can not convert from int data types (even byte) to boolean
     * We must compare by == it is not object
     */

    @Test
    public void comparingTest() {

        String result;

        boolean value = true;
        if (value == true) {
           result = "Value is TRUE";
        } else {
            result = "Value is FALSE";
        }

        assertEquals("Value must be true", "Value is TRUE", result);
    }
}
