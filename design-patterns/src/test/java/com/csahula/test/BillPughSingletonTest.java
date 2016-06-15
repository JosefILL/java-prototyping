package com.csahula.test;

import com.csahula.singleton.BillPughSingleton;
import com.csahula.singleton.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the singleton design pattern.
 */
public class BillPughSingletonTest {

    private final static String USERNAME = "Mockuser";

    /**
     * Initialize data for testing.
     */
    @Before
    public void initialize() {
        User user = new User(USERNAME);
        BillPughSingleton.getInstance().setUser(user);
    }

    /**
     * Test Bill Pugh Singleton implementation.
     */
    @Test
    public void BillPughSingleton() {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        Assert.assertNotNull("The username can not be NULL.", instance1.getUser().getUsername());

        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        Assert.assertEquals("The user must be same.", instance1.getUser(), instance2.getUser());
    }
}