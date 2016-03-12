package com.entreprise.app.services;

import com.entreprise.app.dao.EntrepriseDao;
import com.entreprise.app.entities.Entreprise;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by machu on 12/03/2016.
 */
@Path("/entreprise")
public class EntrepriseService {

    @POST
    @Path("new")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNewCompany (@FormParam("companyName") String name) {
        Entreprise entreprise = new Entreprise(name);
        new EntrepriseDao().create(entreprise);
        return Response.ok().build();
    }
}
