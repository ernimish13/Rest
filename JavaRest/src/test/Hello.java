package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String r=null;
		return r;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		String r=null;
		return r;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml() {
		String r="<h1>hi html</h1>";
		return r;
	}
	
	
}
