package com.csahula.test;

import com.csahula.singleton.ClassicalSingleton;
import com.csahula.singleton.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the singleton design pattern.
 *
 * @autor cyril.sahula@gmail.com (Cyril Sahula)
 */
public class ClassicalSingletonTest {

    private final static String USERNAME = "Mockuser";

    /**
     * Initialize data for testing.
     */
    @Before
    public void initialize() {
        User user = new User(USERNAME);
        ClassicalSingleton.getInstance().setUser(user);
    }

    /**
     * Test Bill Pugh Singleton implementation.
     */
    @Test
    public void BillPughSingleton() {
        ClassicalSingleton instance1 = ClassicalSingleton.getInstance();
        Assert.assertNotNull("The username can not be NULL.", instance1.getUser().getUsername());

        ClassicalSingleton instance2 = ClassicalSingleton.getInstance();
        Assert.assertEquals("The user must be same.", instance1.getUser(), instance2.getUser());
    }
}
