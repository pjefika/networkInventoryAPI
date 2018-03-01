/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.datasources.DatasourcesFraction;

/**
 *
 * @author G0042204
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Swarm container = new Swarm();
        container.fraction(new DatasourcesFraction()
                .jdbcDriver("postgresql", (d) -> {
                    d.driverClassName("org.postgresql.Driver");
                    d.driverModuleName("org.postgresql");
                })
                .dataSource("networkInventoryPU", (ds) -> {
                    ds.driverName("postgresql");
                    ds.connectionUrl(System.getenv("JDBC_DATABASE_URL"));
                    ds.userName(System.getenv("JDBC_DATABASE_USERNAME"));
                    ds.password(System.getenv("JDBC_DATABASE_PASSWORD"));
                })
        );
        
         container.start();
//
//    // Prevent JPA Fraction from installing it's default datasource fraction
//    container.fraction(new PostgreSQLJPAFraction()
//        .inhibitDefaultDatasource()
//        .defaultDatasource("jboss/datasources/MyPU")
//    );
//
//    container.start();

//    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
//    deployment.addClasses(Employee.class);
//    deployment.addAsWebInfResource(new ClassLoaderAsset("META-INF/persistence.xml", Main.class.getClassLoader()), "classes/META-INF/persistence.xml");
//    deployment.addAsWebInfResource(new ClassLoaderAsset("META-INF/load.sql", Main.class.getClassLoader()), "classes/META-INF/load.sql");
//    deployment.addResource(com.example.EmployeeResource.class);
//    deployment.addAllDependencies();
//
//    container.deploy(deployment);
    }
}
