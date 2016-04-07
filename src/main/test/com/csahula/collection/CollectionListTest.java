package com.csahula.collection;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing possibilities of Lists
 * It is my preparation for Java certification and codes do not have purpose
 */
public class CollectionListTest {

    @Test
    public void testArrayList() {

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

    @Test
    public void testLooping() {

        List<Integer> numbers = new ArrayList(Arrays.asList(new int[]{1, 5, 6, 3}));

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

    @Test
    public void testVector() {

        Integer[] numbersPrimitiveList = {1, 5, 6, 3};


        Vector<Integer> numbers = new Vector<>(Arrays.asList(numbersPrimitiveList));
        numbers.add(10);
        numbers.add(4);

        assertThat("Vector is is Collection", numbers, instanceOf(Collection.class));
        assertThat("Is possible to iterate through an Vector", numbers, instanceOf(Iterable.class));
        assertThat("Vector is ordered collection", numbers.get(0), is(1));
        assertThat("Vector is ordered collection", numbers.get(3), is(3));
        assertThat("Vector is not sorted collection", numbers.get(5), not(10));
    }

    @Test
    public void testPerformance() {



    }

    private void generateRandomList() {

        Random randomGenerator = new Random();
        for (int i=0; i<40000; i++) {
        }


    }
}