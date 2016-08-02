package com.csahula.basic;

import com.csahula.basic.pojo.DataWrapper;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class ClassMembersInitializationTest {

    /**
     * The test case tests an default value of data types
     */
    @Test
    public void defaultValuesTest() throws Exception {

        DataWrapper dataWrapper = new DataWrapper();

        assertThat(dataWrapper.isBooleanProperty(), is(false));
        assertThat(dataWrapper.getByteProperty(), is((byte)0));
        assertThat(dataWrapper.getShortProperty(), is((short)0));
        assertThat(dataWrapper.getIntProperty(), is(0));
        assertThat(dataWrapper.getLongProperty(), is(0L));
        assertThat(dataWrapper.getFloatProperty(), is(0.0F));
        assertThat(dataWrapper.getDoubleProperty(), is(0.0));
        assertThat(dataWrapper.getCharProperty(), is('\u0000'));

        assertThat(dataWrapper.getObjectBooleanProperty(), nullValue());
        assertThat(dataWrapper.getObjectByteProperty(), nullValue());
        assertThat(dataWrapper.getObjectShortProperty(), nullValue());
        assertThat(dataWrapper.getObjectIntegerProperty(), nullValue());
        assertThat(dataWrapper.getObjectLongProperty(), nullValue());
        assertThat(dataWrapper.getObjectFloatProperty(), nullValue());
        assertThat(dataWrapper.getObjectDoubleProperty(), nullValue());
    }

    /**
     * Shows not nice initialization of more members and how tricky is it.
     */
    @Test
    public void moreMembersInOneLineTest() throws Exception {

        DataWrapper dataWrapper = new DataWrapper();

        assertThat("Default value assigned.", dataWrapper.getA(), is(0));
        assertThat("Default value assigned.", dataWrapper.getB(), is(0));
        assertThat("Just last in line has assigned value.", dataWrapper.getC(), is(10));
    }
}
