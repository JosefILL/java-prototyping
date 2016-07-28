package com.csahula.datatype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test shows what happens when a concurrency is not managed well.
 * Codes do not have purpose. It is just for my study.
 */
public class CharWrapperTest {

    @Test
    public void isJavaIdentifierPartTest() {
        assertTrue(Character.isJavaIdentifierPart('A'));
        assertTrue(Character.isJavaIdentifierPart('$'));
        assertTrue(Character.isJavaIdentifierStart('$'));
        assertTrue(Character.isJavaIdentifierPart('1'));
        assertFalse(Character.isJavaIdentifierStart('1'));
    }
}
