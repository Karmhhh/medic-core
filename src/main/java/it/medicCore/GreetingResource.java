package it.medicCore;

import java.util.*;

import it.medicCore.Models.Comuni;
import it.medicCore.Models.ComuniRepo;
import it.medicCore.Models.RegioniRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Welcome to MediCore";
    }

    @Inject
    RegioniRepo regioniRepo;

    @Inject
    ComuniRepo comuniRepo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/comuniReg/{id}")
    public List<Comuni> getComReg(@PathParam("id") String id) {
        // Use the repository to fetch the region by ID

        return comuniRepo.find("codiceIstatRegione.nomeRegione", id).list();
    }
}
