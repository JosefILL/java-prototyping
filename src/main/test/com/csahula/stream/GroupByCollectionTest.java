package com.csahula.stream;

import com.csahula.entity.project.Application;
import com.csahula.entity.project.Service;
import com.csahula.entity.project.ServiceDeployment;
import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @autor Cyva (cyril.sahula@gmail.com)
 *
 * Testing creating maps with new features at Java 8.
 * Codes do not have purpose. It is just for my study.
 */
public class GroupByCollectionTest {

    /**
     * Shows how to group by with a two dimensional collection.
     */
    @Test
    public void groupByWithTwoDimensionalCollection() {

        // Mock data
        Application application1 = new Application(11L);
        Application application2 = new Application(22L);

        ServiceDeployment deployment1 = new ServiceDeployment(10L, application1);
        ServiceDeployment deployment2 = new ServiceDeployment(20L, application2);
        ServiceDeployment deployment3 = new ServiceDeployment(30L, application2);

        Stream<ServiceDeployment> deploymentStream = Stream.of(deployment1, deployment2, deployment3);

        // Tested code
        Map<Application, Set<ServiceDeployment>> deploymentsByApplications =
                deploymentStream.collect(groupingBy(ServiceDeployment::getApplication, mapping((ServiceDeployment dep) -> dep, toSet())));

        // Testing results
        assertThat(deploymentsByApplications.size(), is(2));
        assertThat(deploymentsByApplications, allOf(
                hasEntry(is(application1), containsInAnyOrder(deployment1)),
                hasEntry(is(application2), containsInAnyOrder(deployment2, deployment3))
        ));
    }

    @Test
    public void groupByWithThreeDimensionalCollection() {

        // Mock data
        Application application1 = new Application(11L);
        Application application2 = new Application(22L);

        Service service1 = new Service(15L);
        Service service2 = new Service(25L);

        ServiceDeployment deployment1 = new ServiceDeployment(10L, application1, service1);
        ServiceDeployment deployment2 = new ServiceDeployment(20L, application2, service1);
        ServiceDeployment deployment3 = new ServiceDeployment(30L, application2, service2);

        service1.getDeploymentList().addAll(Stream.of(deployment1, deployment2).collect(Collectors.toSet()));
        service2.getDeploymentList().addAll(Stream.of(deployment3).collect(Collectors.toSet()));

        Stream<Service> serviceStream = Stream.of(service1, service2);

        // Tested code
        Map<Application, Set<Service>> servicesByApplications =
                serviceStream.flatMap(m -> m.getDeploymentList().stream())
                    .collect(groupingBy(ServiceDeployment::getApplication, mapping(ServiceDeployment::getService, toSet())));

        // Testing results
        assertThat(servicesByApplications.size(), is(2));

        // TODO Fix it
//        assertThat(servicesByApplications, allOf(
//                hasEntry(is(application1), containsInAnyOrder(service1)),
//                hasEntry(is(application2), containsInAnyOrder(deployment2, deployment3))
//        ));
    }


}
