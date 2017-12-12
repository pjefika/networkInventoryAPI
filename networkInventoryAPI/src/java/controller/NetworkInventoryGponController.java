/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.in.ClientesVizinhosIn;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.domain.ClientesVizinhosService;
import model.domain.FactoryService;

/**
 *
 * @author G0042204
 */
@Path("/networkInventoryGpon")
public class NetworkInventoryGponController {

    private ClientesVizinhosService service;

    @POST
    @Path("/vizinhos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response vi(ClientesVizinhosIn in) {
        try {
            service = FactoryService.createClientesVizinhosService();
            return Response.status(200).entity(service.consultar(in.getEc(), in.getQtde())).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

}
