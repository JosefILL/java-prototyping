package com.csahula.basic;

import com.csahula.basic.pojo.Animal;
import com.csahula.basic.pojo.Monkey;
import com.csahula.basic.pojo.Walkable;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class InstanceOfTest {

    @Test
    public void testSameClass() {

        Monkey superMonkey = new Monkey();

        boolean instance = false;
        if (superMonkey instanceof Monkey) {
            instance = true;
        }

        assertThat("Of course it is an instance of a class.", instance, is(true));
    }

    @Test
    public void testInterfaceImplementation() throws Exception {

        Monkey superMonkey = new Monkey();

        boolean canWalk = false;
        if (superMonkey instanceof Walkable) {
            canWalk = true;
        }

        assertThat("We can test that a class implements an interface.", canWalk, is(true));
    }

    @Test
    public void testSubclassInstance() throws Exception {

        Monkey superMonkey = new Monkey();

        boolean animal = false;
        if (superMonkey instanceof Animal) {
            animal = true;
        }

        assertThat("We can test that Monkey is a subclass of a class.", animal, is(true));
    }
}
