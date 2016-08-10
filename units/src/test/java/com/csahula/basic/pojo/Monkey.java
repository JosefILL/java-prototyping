package com.csahula.basic.pojo;

/**
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class Monkey extends Animal implements Walkable {

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// CONSTRUCTOR ///////////////////////
    //////////////////////////////////////////////////////////////////

    public Monkey() {
        if (getTailsCount() == 0) {
            setTailsCount(20);
        }
    }

    {
        countTails();
    }

    @Override
    public void walk() {
        // Just for test
    }
}
