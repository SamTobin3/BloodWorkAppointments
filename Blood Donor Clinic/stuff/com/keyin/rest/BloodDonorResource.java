package com.keyin.rest;

import javax.ws.rs.PathParam;
import com.keyin.domain.Database;

@Path("/blood_donor")
public class BloodDonorResource {
    private Database database = new Database();

//blood_donor

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public BloodDonor getBloodDonor(@PathParam("id") int id) {
        return database.getDonor(id);
    }

}