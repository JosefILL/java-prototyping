package com.csahula.collection;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing usage of {@link java.util.ArrayList}
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class ArrayListTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayListTest.class);

    @Test
    public void basicTest() {

        Integer[] numbersPrimitiveList = {1, 5, 6, 3};

        List<Integer> numbers = new ArrayList(Arrays.asList(numbersPrimitiveList));
        numbers.add(10);
        numbers.add(4);

        assertThat("ArrayList is Collection", numbers, instanceOf(Collection.class));
        assertThat("Is possible to iterate through an array list", numbers, instanceOf(Iterable.class));
        assertThat("ArrayList is ordered collection", numbers.get(0), is(1));
        assertThat("ArrayList is ordered collection", numbers.get(3), is(3));
        assertThat("ArrayList is not sorted collection", numbers.get(5), not(10));
    }

    /**
     * Testing different ways how to iterate an ArrayList.
     */
    @Test
    public void iterationTest() {

        List<Integer> numbers = Stream.of(1, 5, 6, 3).collect(Collectors.toList());

        System.out.println("Iteration for classics loop:");
        for (int i=0; i<numbers.size(); i++) {
            System.out.printf(String.format("Item with index %d has value %d.\n", 3, 4));
        }

        System.out.println("Iteration for foreach loop:");
        int index = 0;
        for (Integer number : numbers) {
            System.out.printf(String.format("Item with index %d has value %d.\n", 3, 4));
        }

        System.out.println("Iteration for while loop:");
        index = 0;
        while (index < numbers.size()) {
            System.out.printf(String.format("Item with index %d has value %d.\n", index, numbers.get(index)));
            index++;
        }

        System.out.println("Iteration for while loop:");
        index = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.printf(String.format("Item with index %d has value %d.\n", index, iterator.next()));
            index++;
        }
        while (index < numbers.size()) {
            System.out.printf(String.format("Item with index %d has value %d.\n", index++, numbers.get(index)));
            index++;
        }
    }
}