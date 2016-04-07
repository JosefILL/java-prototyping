package com.csahula;

import com.csahula.constant.AnimalEnum;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing possibilities of Java conditions.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class ConditionsCommandsTest {

    /**
     * SWITCH CONDITION NOTES:
     * - We can test only types which are convertible into int.
     *      int, short, byte, char
     * - We can also test types: String, enums
     * - We can not test float, double or long data types.
     */

    @org.junit.Test
    public void switchMatchedWithoutBrakeTest() {

        Integer membersCount = 1000;

        List<Integer> resultValues = new ArrayList<>();
        switch (membersCount) {
            case 0 :
                resultValues.add(1);
            case 100 :
                resultValues.add(100);
            case 1000 :
                resultValues.add(1000);
            case 2000 :
                resultValues.add(2000);
            default:
                resultValues.add(0);
        }


        assertEquals("Case 1000 must match first.", Integer.valueOf(1000), resultValues.get(0));
        assertEquals("After matching with case 1000 other cases must pass also when we do not use brake.", Integer.valueOf(2000), resultValues.get(1));
        assertEquals("When we do not use brake code always goes throught default even it is matched.", Integer.valueOf(0), resultValues.get(2));
        assertEquals(3, resultValues.size());
    }

    @org.junit.Test
    public void switchMatchedTest() {

        char testedLetter = 'B';

        char matchedLetter;
        switch (testedLetter) {
            case 'A' :
                matchedLetter = 'A';
                break;
            case 'B' :
                matchedLetter = 'B';
                break;
            case 'C' :
                matchedLetter = 'C';
                break;
            default:
                matchedLetter = 'N';
        }

        assertEquals("Character B didn't be matched.", testedLetter, matchedLetter);
    }

    @org.junit.Test
    public void switchNotMatchedWithoutDefaultTest() {

        int testedNumber = 200;

        int matchedNumber = 0;
        switch (testedNumber) {
            case 100 :
                matchedNumber = 100;
                break;
            case 150 :
                matchedNumber = 150;
                break;
        }

        assertEquals("Switch did not match no possibility.", 0, matchedNumber);
    }


    @Test
    public void switchNotMatchedTest() {

        AnimalEnum myAnimal = AnimalEnum.CAT;

        AnimalEnum resultValue;
        switch (myAnimal) {
            case DOG :
                resultValue = AnimalEnum.DOG;
                break;
            case CAT :
                resultValue = AnimalEnum.CAT;
                break;
            case HORSE :
                resultValue = AnimalEnum.HORSE;
                break;
            default:
                resultValue = null;
        }

        assertEquals("Result animal should be CAT.", AnimalEnum.CAT, resultValue);
    }


    @Test
    public void ifTest() {

        AnimalEnum myAnimal = AnimalEnum.DUCK;

        boolean cat;
        if (AnimalEnum.CAT.equals(myAnimal)) {
            cat = Boolean.TRUE;
        } else {
            cat = Boolean.FALSE;
        }

        // Without brackets block can be only one statement under if or else
        boolean cow;
        if (AnimalEnum.COW.equals(myAnimal))
            cow = Boolean.TRUE;
        else
            cow = Boolean.FALSE;

        // Not nicely written case but but it shows that only one row is accomplished without curly brackets
        boolean horse;
        if (AnimalEnum.HORSE.equals(myAnimal))
            horse = Boolean.TRUE;
        horse = Boolean.FALSE;

         // If without else
        boolean duck = Boolean.FALSE;
        if (AnimalEnum.DUCK.equals(myAnimal)) {
            duck = Boolean.TRUE;
        }

        assertEquals("My animal is duck not cat", cat, Boolean.FALSE);
        assertEquals("My animal is duck not cow", cow, Boolean.FALSE);
        assertEquals("My animal is duck not horse", horse, Boolean.FALSE);
        assertEquals("My animal is duck", duck, Boolean.TRUE);
    }

    @Test
    public void elseIfTest() {

        int percent = 45;

        boolean passTest = Boolean.FALSE;

        if (percent > 50) {
            passTest = Boolean.TRUE;
        } else if (percent > 40) {
            passTest = Boolean.TRUE;
        } else if (percent > 0) {
            passTest = Boolean.FALSE;
        } else {
            // Unexpected state
        }

        assertEquals("Must pass test with 45% result.", Boolean.TRUE, passTest);
    }



}
