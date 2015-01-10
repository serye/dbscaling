package com.cv.sharding;
 
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("logs")
public class LogService {

	@Inject
	private LogDAO logDAO;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveBook(final UserLog log) {
		logDAO.save(log);
		return Response.ok(log).build();
	}

	@DELETE
	@Path("/{id}")
	public Response deleteBook(final @PathParam("id") long id) {
		logDAO.delete(id);
		return Response.ok().build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		Iterable<UserLog> result = logDAO.findAll();
		return Response.ok(result).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(final @PathParam("id") long id) {
		UserLog log = logDAO.findOne(id);
		return Response.ok(log).build();
	}

}
