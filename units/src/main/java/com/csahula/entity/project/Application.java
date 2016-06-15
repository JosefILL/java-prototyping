package com.csahula.entity.project;

import java.util.Set;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 *
 * Codes do not have purpose. It is just for my study.
 */
public class Application {

    private Long id;

    /**************************************************************************
     * CONSTRUCTOR
     *
     *************************************************************************/

    public Application(Long id) {
        this.id = id;
    }

    /**************************************************************************
     * GETTERS & SETTERS
     *
     *************************************************************************/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**************************************************************************
     * HELPERS
     *
     *************************************************************************/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Application that = (Application) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
