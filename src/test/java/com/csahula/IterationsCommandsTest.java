package com.csahula;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.beans.binding.Bindings.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 *
 * Tests possibilities of iteration commands in Java programming language.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class IterationsCommandsTest {

    /**
     * NOTES:
     * - Do while iterations does one more loop than while one.
     * - First loop in do while iteration always invokes.
     * - Scope of variables defined in either cycle bloc or in for command is just for iteration.
     */

    @Test
    public void classicsWhileTest() {
        int index = 1;
        List<Integer> loops = new ArrayList<>();
        while (index < 10) {
            loops.add(index);
            index++;
        }
        assertEquals("While did 9 loops", 9, loops.size());
        assertEquals("Index must have value 10", 10, index);
    }

    @Test
    public void endlessWhiteTest() {
        int myTestingVariable = 0;
        int checkIndex = 0;
        while (myTestingVariable < 10) {
            // Check condition.
            if (checkIndex > 1000000) {
                break;
            }
            checkIndex++;
        }
        assertEquals("Index must be bigger than 1000000", 1000001, checkIndex);
    }

    @Test
    public void classicsDoWhile() {
        int index = 0;
        List<Integer> loops = new ArrayList<>();
        do {
            loops.add(index);
            index++;
        } while (index < 10);
        assertEquals("While did 10 loops", 10, loops.size());
        assertEquals("Index must have value 10", 10, index);
    }

    @Test
    public void whileWithMoreConditionsTest() {
        int index = 1;
        int loopsLimit = 1000;

        while (index < 10000 && index <= loopsLimit) {
            index++;
        }
        assertEquals("Index must have value: " + (loopsLimit + 1), (loopsLimit + 1), index);
    }


    @Test
    public void forTest() {
        int countOfIterations = 0;
        for (int i=1; i<=10; i++) {
            countOfIterations++;
        }
        assertEquals("Count of iteration must be 10", 10, countOfIterations);
    }

    @Test
    public void forMoreConditionsAndBiggerScopeTest() {
        int a, b = 0;
        for (a=4, b=10; !(((a%16) == 0) && ((b%16) == 0)) ; a+=4, b+=10) {
            if (a > 1000000) {
                break; // Just check
            }
        }

        assertTrue("There must be two numbers which is divisible 16 and multiples for and ten.", ((a > 0) && (b > 0)));
    }

    @Test
    public void forEachThroughListTest() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(60);
        numbers.add(32);

        int iterationsCount = 0;
        for (Integer number : numbers) {
            System.out.println("Number" + number);
            iterationsCount++;
        }

        assertEquals("Count of iterations must be same like size of arrayList", numbers.size(), iterationsCount);
    }

    @Test
    public void iterationWithReturnTest() {
        int index = 0;

        while (index <=10) {
            index++;
            break; // Out from loop
        }

        assertEquals("Break must end loop in first iteration.", 1, index);
    }

    @Test
    public void iterationWithContinueTest() {

        int index = 0;
        int sum = 0;

        // Sum all number divisible two till ten
        while (index <=10) {

            index++;

            if ((index % 2) > 0) {
                continue;
            }
            sum += index;

        }

        assertEquals("Sum all number divisible two till ten", 30, sum);
    }

    /*
    TODO will be part of collections
    @Test
    public void forEachMapListTest() {
        HashMap<String, Integer> employeesOnBranches = new HashMap<>();
        employeesOnBranches.put("PRAGUE", 300);
        employeesOnBranches.put("MADRID", 500);

        int iterationsCount = 0;
        for (Map.Entry<String, Integer> item : employeesOnBranches) {
            StringBuilder builder = new StringBuilder();
            builder.append("Item with hash: ");
            builder.append(item.hashCode());
            builder.append(" has key: ");
            builder.append(item.getKey());
            builder.append(" and value: ");
            builder.append(item.getValue());
            iterationsCount++;
        }

        assertEquals("Count of iterations must be same like size of arrayList", employeesOnBranches.size(), iterationsCount);
    }
    */
}
