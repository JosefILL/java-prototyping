package com.csahula.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Cyril on 6/27/2016.
 */
public class listToMap {

    @Test
    public void listToMap() throws Exception {

        // Mock data
        List<Integer> numbers = Stream.of(0, 1, 3, -2, 0, 1, 0, -3, 2, 3).collect(Collectors.toList());

        // Tested code
        IntStream.range(0, numbers.size()).boxed().collect(toMap(i -> i, numbers::get));

        // Testing result
        //assertThat()
    }
}
