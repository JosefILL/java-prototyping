package com.csahula;

import com.csahula.entity.project.ServiceDeployment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.min;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.mapping;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 *
 * Tests possibilities of arrays in Java programming language.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class ArrayTest {

    @Test
    public void testInitOneDimensionArray() {



//        int[] A = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
//        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
//
//
//        List<Integer> collect = IntStream.range(0, numbers.size()).boxed()
//                .filter(i ->
//                        numbers.get(i) > 0  && numbers.get(i) < numbers.size()
//                        && numbers.get(i) > numbers.get(++i) // A[P] > A[P+1]
//                        && numbers.get(i) > numbers.get(--i) // A[P] > A[P+1]
//                        )
//
//                .collect(Collectors.toList());
//
//        // Number P, Q, R must be bigger than zero and lower than an array size
//
//        IntStream.range(0, numbers.size()).boxed().collect(toMap(i -> i, numbers::get)).forEach((i, p) -> {
//
//            if (0 >= p && p < numbers.size()) {
//
////                IntStream.
//
//            }
//        });
//
//        List<Integer> numbers3 = IntStream.of(A).boxed().filter(p -> p > 0 && p < A.length).collect(Collectors.toList());



//        IntStream.range(0, rawNumbers.length)
//                .filter(i -> rawNumbers[i] > 0 && rawNumbers[i] < rawNumbers.length)
//                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
//
//        numbers.stream().forEachWithIndex((name, index) -> {
////        Arrays.stream(rawNumbers).collect(toSet());
//    }

//                .forEachWithIndex((name, index) -> {




//        });
//            Stream.of(numbers).filter(p -> );
//
//                    .forEach(p -> {
//
//            IntStream.range(0, numbers.length)
//                    .filter(i -> numbers[i].length() <= i)
//                    .mapToObj(i -> numbers[i])
//                    .collect(toList());
//        });

//        numbers.
//
//        IntStream.range(0, numbers.length)
//                .filter(i -> numbers[i].length() <= i)
//                .mapToObj(i -> numbers[i])
//                .collect(toList());

//        assertThat(collect.size(), is(4));
    }

    int test(int[] A) {

        int deep = -1;
        List<Integer> allDepths = new ArrayList<>();


        // When given array is not empty than search for it
        if (A.length > 0) {

            Integer p, q, r;

            for (int index = 1; index < A.length; index++) {

                // Look for triple for this P
                p = A[index];

                // Must be bigger than zero
                if (p <= 0) {
                    continue;
                }

                // Look for Q
                q = p;
                for (int i = (index + 1); i < A.length; i++) {

                    int number = A[i];

                    // Must be smaller than array size
                    if (number >= A.length) {
                        break;
                    }

                    // A[P] > A[P+1]
                    if (q > number) {
                        q = number;
                    } else {
                        break;
                    }
                }

                // Move to next p
                if (q.equals(p)) {
                    continue;
                }

                // Look for R
                r = q;
                for (int i = (index + 1); i < A.length; i++) {

                    int number = A[i];

                    // Must be smaller than array size
                    if (number >= A.length) {
                        break;
                    }

                    // A[P] > A[P+1]
                    if (r < number) {
                        r = number;
                    } else {
                        break;
                    }
                }

                // Move to next p
                if (r.equals(q)) {
                    continue;
                }

                // Find deep
                if (p < q && q < r) {
                    int d = min(p-q, r-q);

                    allDepths.add(d);
                }
            }


        }

        return deep;
    }


}
