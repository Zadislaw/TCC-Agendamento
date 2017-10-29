package com.agendamentoconsulta.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.agendamentoconsulta.model.MedicoModel;

@Path("/medicos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class MedicoFacade {
	static List<MedicoModel> listaMedicos = new ArrayList<MedicoModel>();
	
	static {
		listaMedicos.add(new MedicoModel(1,"Roberto","Pediatra1"));
		listaMedicos.add(new MedicoModel(2,"Roberta","Pediatra2"));
		listaMedicos.add(new MedicoModel(3,"Robert","Pediatra3"));
	}
	
	@GET
	public List<MedicoModel> getMedicos(){
		return listaMedicos;
	}
}
