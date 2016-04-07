package com.csahula.entity;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
     * It is my preparation for Java certification and codes do not have purpose
 *
 * Represents one car
 */
public class Car {

    public Car(Integer id, String brand, String model, String version) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.version = version;
    }

    /**
     * Primary key
     */
    private Integer id;

    /**
     * Brand of car
     */
    private String brand;

    /**
     * Model of car
     */
    private String model;

    /**
     * Version of model
     */
    private String version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!id.equals(car.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
