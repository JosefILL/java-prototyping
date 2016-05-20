package com.csahula.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.ArrayList;

/**
 * This test case tests a performance difference between an ArrayList with an initial capacity
 * and an ArrayList with a preset capacity.
 *
 * @author Cyril Sahula
 */
public class ArrayListInitialCapacity {

    private static final int LOOPS = 500000;

    @Benchmark
    public void withDefaultCapacity() {
        ArrayList<String> withDefaultCapacity = new ArrayList();
        for (int i = 0; i < LOOPS; i++) {
            withDefaultCapacity.add(String.valueOf(i));
        }
    }

    @Benchmark
    public void withPresetCapacity() {
        ArrayList<String> withDefaultCapacity = new ArrayList(LOOPS);
        for (int i = 0; i < LOOPS; i++) {
            withDefaultCapacity.add(String.valueOf(i));
        }
    }

}
