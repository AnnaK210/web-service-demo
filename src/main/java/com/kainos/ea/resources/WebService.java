package com.kainos.ea.resources;
import com.kainos.ea.db.DatabaseConnector;
import io.swagger.annotations.Api;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.SQLException;

@Path("/api")
@Api("Engineering Academy Dropwizard API")

public class WebService {
    @GET
    @Path("/Employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployee(@PathParam("id") int id) {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.getConnection();
        EmployeeDao newDao = new EmployeeDao();
        String m;
        try {
            m = newDao.getEmployee(connection, id).toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Response.status(Response.Status.OK).entity(m).build();


        //Message myMessage = new Message("Hello from a RESTful Web service: " + message);
        //return "Hello from a RESTful Web service: " + message;
    }

    /*@GET
    @Path()
    @Produces(MediaType.APPLICATION_JSON)
    public Response {
        return;

    }*/


    @POST
    @Path("/print")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendMsg(Message message) {
        return "Hello from a RESTful Web service: " + message.getText();
    }
}

// Read employee ID from path
// Get employee from DB
// Map DB fields to employee instance
// Return employee in response body
