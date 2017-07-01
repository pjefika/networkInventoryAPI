/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.domain.CustomerServiceInter;
import model.domain.FactoryService;

/**
 *
 * @author G0042204
 */
@Path("/networkInventory")
public class ClienteController implements EfikaCustomerRestInter {

    private CustomerServiceInter c;

    @GET
    @Path("/{instancia}")
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
