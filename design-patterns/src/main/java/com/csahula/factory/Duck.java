package com.csahula.factory;

/**
 * Class represented a duck.
 */
public class Duck implements Eatable {

    @Override
    public String eat() {
        return "Duck is eating.";
    }
}
