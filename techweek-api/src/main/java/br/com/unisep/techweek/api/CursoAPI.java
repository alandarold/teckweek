package br.com.unisep.techweek.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.unisep.techweek.model.Curso;

@Path("curso")
public class CursoAPI {

	@GET
	@Path("{id}")
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )
	public Response getCurso( @PathParam("id") int id){
		
		Curso curso = buscarCurso(id);
		
		return Response.ok( curso ).build();
	}
	
	private Curso buscarCurso(int id){
		Curso curso = new Curso();
		curso.setId(id);
		curso.setNome("Nome do curso "+id);
		return curso;
	}
	
}
