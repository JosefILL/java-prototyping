package com.csahula.basic;

import com.csahula.basic.pojo.Monkey;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * The test case tests an calling order of code block in class
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class ClassInitializationTest {

    @Test
    public void initializationOrderCodeBlockTest() {

        Monkey monkey = new Monkey();

        assertThat("Setting in a constructor.", monkey.getEyesCount(), is(10));
        assertThat("Property setting goes first.", monkey.getHeadsCount(), is(1));
        assertThat("Usage a method before a constructor", monkey.getNecksCount(), is(2));
        assertThat("Parent initialization goes always first.", monkey.getTailsCount(), is(10));
        assertThat("Code block generally invokes before an invoking of constructor.", monkey.getEarsCount(), is(5));
        assertThat("Code block invokes before an invoking of constructor.", monkey.getLegsCount(), is(2));
    }
}
