package com.csahula.factory;

/**
 * Factory manages object initialization and initializes right object.
 *
 * @author cyril.sahula@gmail.com (Cyril Sahula)
 */
public class AnimalFactory {

    /**
     * Creates animal object depends on parameter.
     *
     * @param animal
     * @return Right object of animal.
     */
    public static Eatable getAnimal(Animal animal) {

        Eatable resultObject = null;

        if (Animal.LION.equals(animal)) {
            resultObject = new Lion();
        } else if (Animal.DUCK.equals(animal)) {
            resultObject = new Duck();
        } else {
            throw new IllegalStateException("Unknown animal.");
        }

        return resultObject;
    }

}
