package com.csahula.test;

import com.csahula.singleton.ClassicalSingleton;
import com.csahula.singleton.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Tests which show how to destroy singleton design pattern.
 *
 * Code is inspired by:
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
 */
public class DestroySingletonPatternTest {

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
        ClassicalSingleton instanceOne = ClassicalSingleton.getInstance();
        ClassicalSingleton instanceTwo = null;
        try {
            Constructor[] constructors = ClassicalSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (ClassicalSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals("The instances should be same but are not same.", instanceOne.hashCode(), instanceTwo.hashCode());
    }
}
