package com.csahula.entity;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 * It is my preparation for Java certification and codes do not have purpose.
 *
 * Represents one employee in company and his properties.
 */
public class Employee {

    public Employee(Long id) {
        this.id = id;
    }

    /**
     * Primary key of employee
     */
    private Long id;

    /**
     * First name of employee
     */
    private String firstName;

    /**
     * Last name of employee
     */
    private String lastName;

    /**
     * Get {@link com.csahula.entity.Employee#id}
     */
    public Long getId() {
        return id;
    }

    /**
     * Set {@link com.csahula.entity.Employee#id}
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get {@link com.csahula.entity.Employee#firstName}
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set {@link com.csahula.entity.Employee#firstName}
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get {@link com.csahula.entity.Employee#lastName}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set {@link com.csahula.entity.Employee#lastName}
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!id.equals(employee.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
