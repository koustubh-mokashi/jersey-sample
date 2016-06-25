package com.examples.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class TestResource {

	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getHello() {
		return "Hello World";
	}

}
