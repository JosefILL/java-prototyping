package com.csahula.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing usage of {@link java.util.LinkedList}
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class LinkedListTest {

    @Test
    public void testLinkedList() {

        Integer[] numbersPrimitiveList = {1, 5, 6, 3};

        List<Integer> numbers = new LinkedList<>(Arrays.asList(numbersPrimitiveList));
        numbers.add(10);
        numbers.add(4);

        assertThat("LinkedList is is Collection", numbers, instanceOf(Collection.class));
        assertThat("Is possible to iterate through an linked list", numbers, instanceOf(Iterable.class));
        assertThat("LinkedList is ordered collection", numbers.get(0), is(1));
        assertThat("LinkedList is ordered collection", numbers.get(3), is(3));
        assertThat("LinkedList is not sorted collection", numbers.get(5), not(10));
    }


}