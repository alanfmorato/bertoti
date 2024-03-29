package org.park;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/filme")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nome}/{diretor}/{ano}/")
    public Response filme2(@PathParam String nome, @PathParam String diretor, @PathParam String ano) {	
		List<Filme> filmesEncontrados = model.buscarEspecificacao(new Especificacao(nome, diretor, ano));	
		String json = new Gson().toJson(filmesEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/nome/{nome}")
	public Response filme3(@PathParam("nome") String nome) {
	    List<Filme> filmesEncontrados = model.buscarNome(nome);
	    String json = new Gson().toJson(filmesEncontrados);
	    return Response.status(200).entity(json).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/diretor/{diretor}")
	public Response filme4(@PathParam("diretor") String diretor) {
	    List<Filme> filmesEncontrados = model.buscarDiretor(diretor);
	    String json = new Gson().toJson(filmesEncontrados);
	    return Response.status(200).entity(json).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ano/{ano}")
	public Response filme5(@PathParam("ano") String ano) {
	    List<Filme> filmesEncontrados = model.buscarAno(ano);
	    String json = new Gson().toJson(filmesEncontrados);
	    return Response.status(200).entity(json).build();
	}
	
	@GET
	@Path("/filme/ano")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getNomesFilmes() {
	    List<Filme> filmes = model.getFilmes();
	    List<String> anos = new ArrayList<>();
	    for (Filme filme : filmes) {
	        anos.add(filme.getEspc().getAno());
	    }
	    return anos;
	}

	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}