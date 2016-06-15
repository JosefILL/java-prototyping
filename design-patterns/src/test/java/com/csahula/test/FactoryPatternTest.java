package com.csahula.test;

import com.csahula.factory.Animal;
import com.csahula.factory.AnimalFactory;
import com.csahula.factory.Duck;
import com.csahula.factory.Eatable;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Testing factory design pattern.
 */
public class FactoryPatternTest {

    @Test
    public void testReturnValue() {

        Eatable animal = AnimalFactory.getAnimal(Animal.LION);
        String lionEating = animal.eat();

        assertThat(lionEating, is("Lion is eating."));
    }

    @Test
    public void testInstance() {

        Eatable duck = AnimalFactory.getAnimal(Animal.DUCK);

        assertThat(duck, instanceOf(Duck.class));
    }




}
