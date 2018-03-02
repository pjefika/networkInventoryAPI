/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.datasources.DatasourcesFraction;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import org.wildfly.swarm.jpa.mysql.MySQLJPAFraction;

/**
 *
 * @author G0042204
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Swarm container = new Swarm();

        container.fraction(new DatasourcesFraction()
                .jdbcDriver("mysql", (d) -> {
                    d.driverClassName("com.mysql.jdbc.Driver");
                    d.xaDatasourceClass("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
                    d.driverModuleName("com.mysql");
                })
                .dataSource("MySQL", (ds) -> {
                    ds.jndiName("java:/dw_efika");
                    ds.driverName("mysql");
                    ds.connectionUrl("jdbc:mysql://**.**.**.**:****/?autoReconnect=true");
                    ds.userName("****");
                    ds.password("****");
                })
        );

        container.fraction(new MySQLJPAFraction()
                .inhibitDefaultDatasource()
                .defaultDatasource("jboss/datasources/MySQL")
        );

        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addAsWebInfResource(new ClassLoaderAsset("META-INF/persistence.xml", Main.class.getClassLoader()), "classes/META-INF/persistence.xml");
        deployment.addAllDependencies();
        container.start().deploy(deployment);

    }
}
