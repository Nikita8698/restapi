package com.restapi;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restapi")
public class RestAPI {
	
	@Path("/signup")	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String insertForm(
			@FormParam("name") String name,
			@FormParam("email") String email,
			@FormParam("username") String username,
			@FormParam("password") String password)
	{
		if(name!=null && email!=null && username!=null && password!=null)
		{	
			System.out.println(name+"\t"+email+"\t"+username+"\t"+password);
			return "{\"status\":\"sign up success....\"}";
		}
		else
		{
			return "{\"status\":\"sign up fail...\"}";
		}
		
	}
	@Path("/signin")	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String insertForm(@FormParam("username") String username,
			@FormParam("password") String password)
	{
		if(username=="nikita" && password=="nikita123")
		{	
			System.out.println(username+"\t"+password);
			return "{\"status\":\"sign in success...\"}";
		}
		else
		{
			return "{\"status\":\"sign in fail...\"}";
		}
		
	}
}
