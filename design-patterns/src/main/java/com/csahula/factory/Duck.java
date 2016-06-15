package com.csahula.factory;

/**
 * Class represented a duck.
 *
 * @author cyril.sahula@gmail.com (Cyril Sahula)
 */
public class Duck implements Eatable {

    @Override
    public String eat() {
        return "Duck is eating.";
    }
}
