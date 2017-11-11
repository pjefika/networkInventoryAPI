/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.domain.FactoryService;
import model.domain.CustomerService;

/**
 *
 * @author G0042204
 */
@Path("/networkInventory")
public class ClienteController implements EfikaCustomerRestInter {

    private CustomerService c;

    @GET
    @Path("/{instancia}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response getCliente(@PathParam("instancia") String instancia) {
        try {
            c = FactoryService.create();
            return Response.status(200).entity(c.consultar(instancia)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

}
