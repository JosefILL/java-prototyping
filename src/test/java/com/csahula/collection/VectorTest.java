package com.csahula.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing usage of {@link java.util.Vector}
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class VectorTest {

    @Test
    public void testVector() {

        Integer[] numbersPrimitiveList = {1, 5, 6, 3};

        Vector<Integer> numbers = new Vector(Arrays.asList(numbersPrimitiveList));
        numbers.add(10);
        numbers.add(4);

        assertThat("Vector is is Collection", numbers, instanceOf(Collection.class));
        assertThat("Is possible to iterate through an Vector", numbers, instanceOf(Iterable.class));
        assertThat("Vector is ordered collection", numbers.get(0), is(1));
        assertThat("Vector is ordered collection", numbers.get(3), is(3));
        assertThat("Vector is not sorted collection", numbers.get(5), not(10));
    }


}