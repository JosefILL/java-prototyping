package com.csahula;

import com.csahula.entity.Accountant;
import com.csahula.entity.Car;
import com.csahula.entity.DateWrapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Test cases testing using equals function.
 * It is my preparation for Java certification and codes do not have purpose
 */
public class EqualsTest {

//    @Test
//    public void testNonImplementedEquals() {
//
//        Accountant newAccountant = new Accountant(Long.valueOf(10));
//        newAccountant.setFirstName("John");
//        newAccountant.setLastName("Graham");
//
//
//        Accountant newAccountant2 = new Accountant(Long.valueOf(20));
//        newAccountant2.setFirstName("Katie");
//        newAccountant2.setLastName("Beautiful");
//
//        Accountant newAccountant3 = newAccountant;
//
//        assertThat("These two references do not refer to same object.", Boolean.FALSE, is(newAccountant.equals(newAccountant2)));
//        assertThat("These two references refer to same object.", Boolean.TRUE, is(newAccountant.equals(newAccountant3)));
//    }
//
//    @Test
//    public void testImplementedEquals() {
//
//        Car tomsCar = new Car(10, "Skoda", "Fabia", "2");
//        Car bensCar = new Car(20, "Skoda", "Octavia", "2");
//        Car katiesCar = new Car(10, "Skoda", "Fabia", "2");
//
//        assertThat("Tom and Ben have different car.", Boolean.FALSE, is(tomsCar.equals(bensCar)));
//        assertThat("Tom and Katie drive with same car.", Boolean.TRUE, is(tomsCar.equals(katiesCar)));
//        assertThat("Katie's and Tom's cars refer to different object.", Boolean.FALSE, is(bensCar == katiesCar));
//    }
//
//    @Test
//    public void testName() {
//
//        Map<DateEqualHash, Integer> statsEqualsValueHash = new HashMap<>();
//        Map<DateMonthGroupHash, Integer> statsMonthsGroupHash = new HashMap<>();
//        Map<DateWrapper, Integer> statsGenerationHash = new HashMap<>();
//
//        int lastIndex = 40000;
//        DateTime dateTime = new DateTime();
//        dateTime = dateTime.withYear(2015);
//        dateTime = dateTime.withMonthOfYear(3);
//        dateTime = dateTime.withDayOfMonth(30);
//
//        for (int i = 0; i <= lastIndex; i++) {
//
//            int clicksOnThePage = 50;
//
//            // Find out first date
//            if (i == 0) {
//                System.out.println("Start: " + dateTime.toString());
//            }
//
//            int minute = dateTime.getMinuteOfHour();
//            int hour = dateTime.getHourOfDay();
//            int day = dateTime.getDayOfMonth();
//            int month = dateTime.getMonthOfYear();
//            int year = dateTime.getYear();
//
//            statsMonthsGroupHash.put(new DateMonthGroupHash(minute, hour, day, month, year), clicksOnThePage);
//            statsEqualsValueHash.put(new DateEqualHash(minute, hour, day, month, year), clicksOnThePage);
//            statsGenerationHash.put(new DateWrapper(minute, hour, day, month, year), clicksOnThePage);
//
//            dateTime = dateTime.plusMinutes(1);
//
//            // Find out last date
//            if (i == lastIndex) {
//                System.out.println("End: " + dateTime.toString());
//            }
//        }
//
//        long monthGroupTimeBegin = System.nanoTime();
//        assertThat(statsMonthsGroupHash.get(new DateMonthGroupHash(5, 15, 20, 4, 2015)), notNullValue());
//        assertThat(statsMonthsGroupHash.get(new DateMonthGroupHash(5, 15, 21, 4, 2015)), notNullValue());
//        assertThat(statsMonthsGroupHash.get(new DateMonthGroupHash(5, 15, 22, 4, 2015)), notNullValue());
//        assertThat(statsMonthsGroupHash.get(new DateMonthGroupHash(5, 15, 23, 4, 2015)), notNullValue());
//        assertThat(statsMonthsGroupHash.get(new DateMonthGroupHash(5, 15, 24, 4, 2015)), notNullValue());
//        long monthGroupTime = System.nanoTime() - monthGroupTimeBegin;
//
//        long sameHashTimeBegin = System.nanoTime();
//        assertThat(statsEqualsValueHash.get(new DateEqualHash(5, 15, 20, 4, 2015)), notNullValue());
//        assertThat(statsEqualsValueHash.get(new DateEqualHash(5, 15, 21, 4, 2015)), notNullValue());
//        assertThat(statsEqualsValueHash.get(new DateEqualHash(5, 15, 22, 4, 2015)), notNullValue());
//        assertThat(statsEqualsValueHash.get(new DateEqualHash(5, 15, 23, 4, 2015)), notNullValue());
//        assertThat(statsEqualsValueHash.get(new DateEqualHash(5, 15, 24, 4, 2015)), notNullValue());
//        long equalHashTime = System.nanoTime() - sameHashTimeBegin;
//
//        long timeGenerationTimeBegin = System.nanoTime();
//        assertThat(statsGenerationHash.get(new DateWrapper(5, 15, 20, 4, 2015)), notNullValue());
//        assertThat(statsGenerationHash.get(new DateWrapper(5, 15, 21, 4, 2015)), notNullValue());
//        assertThat(statsGenerationHash.get(new DateWrapper(5, 15, 22, 4, 2015)), notNullValue());
//        assertThat(statsGenerationHash.get(new DateWrapper(5, 15, 23, 4, 2015)), notNullValue());
//        assertThat(statsGenerationHash.get(new DateWrapper(5, 15, 24, 4, 2015)), notNullValue());
//        long generationTime = System.nanoTime() - timeGenerationTimeBegin;
//
//        System.out.println("Object with hash composed by month year groups: " + monthGroupTime);
//        System.out.println("Object with equals hash code: " + equalHashTime);
//        System.out.println("Object with hash code composed by automatic generation code: " + generationTime);
//
//        assertThat("IDE generates hash code with the fastest implementation", generationTime, lessThan(equalHashTime));
//        assertThat("IDE generates hash code with the fastest implementation", generationTime, lessThan(monthGroupTime));
//    }
//
//    class DateMonthGroupHash extends DateWrapper {
//
//        public DateMonthGroupHash(int minute, int hour, int day, int month, int year) {
//            super(minute, hour, day, month, year);
//        }
//
//        @Override
//        public int hashCode() {
//            int result = getMonth();
//            result = 31 * result + getDay();
//            result = 31 * result + getYear();
//            return result;
//        }
//    }
//
//    class DateEqualHash extends DateWrapper {
//
//        public DateEqualHash(int minute, int hour, int day, int month, int year) {
//            super(minute, hour, day, month, year);
//        }
//
//        @Override
//        public int hashCode() {
//            return 100;
//        }
//    }

}


