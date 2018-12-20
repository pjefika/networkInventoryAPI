/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.networkInventoryAPI.controller;

import br.net.gvt.efika.networkInventoryAPI.controller.in.StringParameterRequest;
import br.net.gvt.efika.networkInventoryAPI.dao.FactoryDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author G0042204
 */
@Path("/networkInventorySigres")
public class NetworkInventorySigresController {
    
    @POST
    @Path("/dslamDetail")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDslamDetail(StringParameterRequest body) {
        try {
            return Response.status(200).entity(FactoryDAO.createNetworkInventorySigresMetalicoDAO().consultarDslamDetail(body.getParameter())).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }
    
    @POST
    @Path("/oltDetail")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOltDetail(StringParameterRequest body) {
        try {
            return Response.status(200).entity(FactoryDAO.createOltDetailSigresFibraDAO().consultar(body.getParameter())).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }
    
}
