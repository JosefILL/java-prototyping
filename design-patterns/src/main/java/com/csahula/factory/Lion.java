package com.csahula.factory;

/**
 * Class represented a duck.
 *
 * @author cyril.sahula@gmail.com (Cyril Sahula)
 */
public class Lion implements Eatable {

    @Override
    public String eat() {
        return "Lion is eating.";
    }
}
