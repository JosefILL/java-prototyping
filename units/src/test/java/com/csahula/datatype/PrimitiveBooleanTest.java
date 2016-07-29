package com.csahula.datatype;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Codes do not have purpose. It is just for my study.
 */
public class PrimitiveBooleanTest {

    @Test
    public void comparingTest() {

        String result;

        boolean value = true;
        if (value == true) {
           result = "Value is TRUE";
        } else {
            result = "Value is FALSE";
        }

        assertThat(result, is("Value is TRUE"));
    }
}
