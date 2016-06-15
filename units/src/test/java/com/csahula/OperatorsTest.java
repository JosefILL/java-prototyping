package com.csahula;

import com.csahula.constant.AnimalEnum;
import com.csahula.entity.Accountant;
import com.csahula.entity.AccountantLeader;
import com.csahula.entity.Employee;
import com.csahula.entity.LeadingAble;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing possibilities and using Java operators.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class OperatorsTest {

    @Test
    public void assignmentPrimitiveTest() {
        int a = 50;
        assertEquals(50, a);
    }

    @Test
    public void assignmentObjectTest() {

        List sameList;
        List changedList;
        List nullList;

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list1.add(30);
        list1.add(30);

        sameList = list1;
        changedList = list2;
        changedList.add(50);

        nullList = list2;
        nullList = null;

        assertEquals("Both variables have same reference to object.", sameList.hashCode(), list1.hashCode());
        assertEquals("Both variables have same reference to object.", list2.size(), changedList.size());
        assertEquals("Assigning null delete only reference on variable", null, nullList);
        assertTrue("Assigning null delete only reference on variable", (list2 != null));
    }


    @Test
    public void additionCompoundOperatorsTest() {

        int a = 4;
        int b = 6;

        int compoundResult = a;
        compoundResult += b;
        int result = a + b;

        assertEquals(result, compoundResult);
    }

    @Test
    public void subtractCompoundOperatorsTest() {

        int a = 4;
        int b = 6;

        int compoundResult = a;
        compoundResult -= b;
        int result = a - b;

        assertEquals(result, compoundResult);
    }

    @Test
    public void divideCompoundOperatorsTest() {

        int a = 4;
        int b = 6;

        int compoundResult = a;
        compoundResult /= b;
        int result = a / b;

        assertEquals(result, compoundResult);
    }

    @Test
    public void multiplyCompoundOperatorsTest() {

        int a = 4;
        int b = 6;

        int compoundResult = a;
        compoundResult *= b;
        int result = a * b;

        assertEquals(result, compoundResult);
    }

    @Test
    public void relationalOperatorsTest() {

        int a = 0;
        int b = 5;
        int c = 5;
        int d = 8;

        boolean lowerThanPassed = Boolean.FALSE;
        if (a < b) {
            lowerThanPassed = Boolean.TRUE;
        }

        boolean lowerOrEqualThanPassed = Boolean.FALSE;
        if (b <= c) {
            lowerOrEqualThanPassed = Boolean.TRUE;
        }

        boolean notEqualPassed = Boolean.FALSE;
        if (a != b) {
            notEqualPassed = Boolean.TRUE;
        }

        boolean isNotEqualPassed = Boolean.FALSE;
        if (a != b) {
            isNotEqualPassed = Boolean.TRUE;
        }

        boolean largerPassed = Boolean.FALSE;
        if (d > b) {
            largerPassed = Boolean.TRUE;
        }

        boolean largerOrEqualPassed = Boolean.FALSE;
        if (b >= c) {
            largerOrEqualPassed = Boolean.TRUE;
        }

        boolean equalPassed = Boolean.FALSE;
        if (b == c) {
            equalPassed = Boolean.TRUE;
        }

        assertEquals(Boolean.TRUE, lowerThanPassed);
        assertEquals(Boolean.TRUE, lowerOrEqualThanPassed);
        assertEquals(Boolean.TRUE, notEqualPassed);
        assertEquals(Boolean.TRUE, isNotEqualPassed);
        assertEquals(Boolean.TRUE, largerOrEqualPassed);
        assertEquals(Boolean.TRUE, equalPassed);
    }

    @Test
    public void wrongEqualTest() {

        boolean secured = false;
        boolean sendMoney = false;


        if (secured = true) {
            sendMoney = true;
        }

        // Wrong command of equality it assigns value into variable instead of comparing variables
        assertEquals(true, secured);
        assertEquals(true, sendMoney);
    }

    @Test
    public void equalPrimitiveTypeTest() {

        boolean secured = false;
        boolean sendMoney = false;

        // Wrong command of equality it assigns value into variable
        if (secured == true) {
            sendMoney = true;
        }

        assertEquals(false, secured);
        assertEquals(false, sendMoney);
    }

    @Test
    public void equalReferenceTypesTest() {

        Integer a = new Integer(10);
        Integer b = new Integer(10);
        Integer c = new Integer(30);

        b = c;

        // == operator checked just reference not object
        assertFalse("a and b do not refer to same variable", (a == b));
        assertTrue("b and c refer to same variable", (b == c));
    }

    @Test
    public void equalStringTypeTest() {

        String str1 = new String("baf");
        String str2 = new String("baf");
        String str3 = new String("Baf");

        assertFalse("str1 and str2 do not refer to same variable", (str1 == str2));
        assertTrue("str1 and str2 are equal String objects", (str1.equals(str2)));
        assertFalse("String equal is case sensitive", (str3.equals(str2)));
    }

    @Test
    public void equalEnumTypeTest() {

        AnimalEnum animalOne = AnimalEnum.DOG;
        AnimalEnum animalTwo = AnimalEnum.DOG;

        assertTrue("animalOne and animalTwo refers on same variable", (animalOne == animalTwo));
        assertTrue("animalOne and animalTwo are really equals like object", (animalOne.equals(animalTwo)));
    }

    @Test
    public void instanceOfTest() {

        String name = "Cyril Sahula";

        Accountant newAccountant = new Accountant(new Long(1000));
        AccountantLeader newAccountantLeader = new AccountantLeader(new Long(1001));

        int[] nums = new int[3];

        assertTrue("variable name is really String class", (name instanceof String));
        assertTrue("All Java object inherit from Object class", (newAccountant instanceof Object));
        assertTrue("Array is instance of object.", (nums instanceof Object));
        assertTrue("Variable is Accountant class", (newAccountant instanceof Accountant));
        assertTrue("Accountant is Employee there is relationship: is a", (newAccountant instanceof Employee));
        assertTrue("Accountant is LeadingAble there is relationship: is a", (newAccountantLeader instanceof LeadingAble));
    }

    @Test
    public void divisionOperatorTest() {

        int integerDivisionResult = 13 / 4;
        float floatDivisionResult = 14.0f / 4.0f;
        double doubleDivisionResult = 14.0 / 4.0;

        assertEquals("Division of integer behave differently and returns only ínteger", 3, integerDivisionResult);
        assertEquals("Division of float behave normally.", 3.5, floatDivisionResult, 0.0);
        assertEquals("Division of float behave normally.", 3.5, doubleDivisionResult, 0.0);
    }

    @Test
    public void remainderOperatorTest() {

        int integerReminderResult = (15 % 4);
        double doubleReminderResult = 15.0 % 4.0;

        assertEquals(3, integerReminderResult);
        assertEquals(3.0, doubleReminderResult, 0.0);
    }

    @Test
    public void incrementAndDecrementOperator() {

        int a = 4, b = 4, c = 4, d = 4;

        int prefixIncrementNum = a++;
        int suffixIncrementNum = ++b;
        int prefixDecrementNum = --c;
        int suffixDecrementNum = d--;


        int suffixIndex = 0;
        for (int i=1;i<=5;i++) {
            suffixIndex++;
        }

        int prefixIndex = 0;
        for (int i=1;i<=5;++i) {
            prefixIndex++;
        }


        assertEquals("Incrementation is after assignment.", prefixIncrementNum, 4);
        assertEquals("Incrementation is before assignment.", suffixIncrementNum, 5);
        assertEquals("Decrementation is before assignment.", prefixDecrementNum, 3);
        assertEquals("Decrementation is after assignment.", suffixDecrementNum, 4);
        assertEquals(suffixIndex, 5);
        assertEquals(prefixIndex, 5);
    }

    @Test
    public void conditionOperator() {

        final String fullMessage = "Full";
        final String availableMessage = "Place available";

        int countOfEmployees = 7;

        boolean capacityFull = (countOfEmployees >  5) ? true : false;
        String userMessage = (capacityFull == true) ? fullMessage : availableMessage;

        assertEquals(capacityFull, true);
        assertEquals(userMessage, fullMessage);
    }

    @Test
    public void bitwiseOperatorsTest() {
        byte b1 = 33;
        byte b2 = 20;

        System.out.println(b1 & b2);
    }

    @Test
    public void logicalOperatorsTest() {

        boolean secured = false;
        boolean debugMode = true;
        String user = null;

        boolean shortAndThrowsNull = false;
        try {
            boolean adminRole;
            if (secured == true && user.equals("administrator")) {
                adminRole = true;
            } else {
                adminRole = false;
            }
        } catch (NullPointerException e) {
            shortAndThrowsNull = true;
        }

        boolean notShortAndThrowsNull = false;
        try {
            boolean adminRole;
            if (secured == true & user.equals("administrator")) {
                adminRole = true;
            } else {
                adminRole = false;
            }
        } catch (NullPointerException e) {
            notShortAndThrowsNull = true;
        }

        boolean notShortOrThrowsNull = false;
        try {
            boolean adminRole;
            if (debugMode == true | user.equals("administrator")) {
                adminRole = true;
            } else {
                adminRole = false;
            }
        } catch (NullPointerException e) {
            notShortOrThrowsNull = true;
        }



        assertEquals("Short-Circuit logical operators evaluite only first statement in sample", false, shortAndThrowsNull);
        assertEquals("Not short-Circuit logical operators evaluite always all statements", true, notShortAndThrowsNull);
        assertEquals("Not short-Circuit logical operators evaluite always all statements", true, notShortOrThrowsNull);
    }

    public void xorLogicalOperatorTest() {

        int a = 5;
        int b = 10;


        boolean resultSample1 = (a < b) ^ (a < 60);

        boolean resultSample2 = false;
        try {
            String name = null;
            if ((a < b) ^ (name.equals("Petr"))) {
                resultSample2 = false;
            };
        } catch (NullPointerException e) {
            resultSample2 = true;
        }

        boolean resultSample3 = (a < b) ^ (a < 1);


        assertFalse("In sample 1 both expressions are true", resultSample1);
        assertTrue("In sample 2 both expressions are always evaluated", resultSample2);
        assertTrue("Only one expression returns true. It is XOR sample.", resultSample3);
    }



}
