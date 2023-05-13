package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Filme> filmes = new LinkedList<Filme>();

	public Model() {
		addFilme(new Filme("5555-22", new Especificacao("Vingadores: Era de Ultron", "Joss Whedon", "2015")));
		addFilme(new Filme("5555-23", new Especificacao("Vingadores: Ultimato", "Joe Russo", "2019")));
		addFilme(new Filme("5555-24", new Especificacao("Vingadores: Guerra Infinita", "Joe Russo", "2018")));
		addFilme(new Filme("5555-25", new Especificacao("Vingadores", "Joss Whedon", "2012")));
	}
	
	public void addFilme(Filme filme){
		filmes.add(filme);
	}
	
	public Filme buscarCodigo(String codigo){
		for(Filme filme:filmes){
			if(filme.getCodigo().equals(codigo)) return filme;
		}
		
		return null;
	}
	
	
	public List<Filme> buscarEspecificacao(Especificacao esp){
		List<Filme> filmesEncontrados = new LinkedList<Filme>();
		for(Filme filme:filmes){
			 if(esp.comparar(filme.getEspc())) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;	
	}
	
	
	public List<Filme> buscarNome(String nome){
		List<Filme> filmesEncontrados = new LinkedList<Filme>();
		for(Filme filme:filmes) {
			if(filme.getEspc().getNome().equals(nome)) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;
	}
	
	public List<Filme> buscarDiretor(String diretor){
		List<Filme> filmesEncontrados = new LinkedList<Filme>();
		for(Filme filme:filmes) {
			if(filme.getEspc().getDiretor().equals(diretor)) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;
	}
	
	public List<Filme> buscarAno(String ano){
		List<Filme> filmesEncontrados = new LinkedList<Filme>();
		for(Filme filme:filmes) {
			if(filme.getEspc().getAno().equals(ano)) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;
	}
	
	public List<Filme> getFilmes(){
		return filmes;
	}

}
