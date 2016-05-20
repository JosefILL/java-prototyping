package com.csahula.entity.project;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Cyril Sahula (cyril.sahula@gmail.com)
 *
 * Codes do not have purpose. It is just for my study.
 */
public class ServiceDeployment {

    private Long id;

    private Application application;

    private Service service;

    /**************************************************************************
     * CONSTRUCTOR
     *
     *************************************************************************/

    public ServiceDeployment(Long id, Application application) {
        this.id = id;
        this.application = application;
    }

    public ServiceDeployment(Long id, Application application, Service service) {
        this.id = id;
        this.application = application;
        this.service = service;
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

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    /**************************************************************************
     * HELPERS
     *
     *************************************************************************/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceDeployment that = (ServiceDeployment) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
