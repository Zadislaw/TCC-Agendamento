package com.agendamentoconsulta.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/Exemplowjaxrs")
public class Exemplo1 {
	
	
	@GET
	public String executaGet(){		
		return "Exemplo 01, executou o GET!";		
	}
	
	@POST
	public String executaPost(){
		return "Exemplo 01, executou o POST!";		
	}
		
}
