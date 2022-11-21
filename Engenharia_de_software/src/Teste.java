import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		Locadora locadora = new Locadora();
		assertEquals(locadora.getFilme().size(), 0);
		
		locadora.cadastrarFilme(new Filme("Pantera Negra", new Especificacao("2018", "Ryan Coogler", "Chadwick Boseman", "Sinopse Teste", "3 Horas", "Ação")));
		locadora.cadastrarFilme(new Filme("Vingadores", new Especificacao("2012", "Joss Whedon", "Chris Evans", "Sinopse Teste 2", "3 Horas", "Ação")));
		locadora.cadastrarItem(new Item("232320-0", "25 de setembro de 2022"));
		
		assertEquals(locadora.getFilme().size(), 2);
		assertEquals(locadora.getItem().size(), 1);
		
		Filme filmeEncontrado = locadora.buscarFilmePorTitulo(" Negra");
		Item itemEncontrado = locadora.buscarItemPorNumeroDeSerie("232320-0");
		
		assertEquals(filmeEncontrado.getEspec().getanoLancamento(), "2018");
		assertEquals(itemEncontrado.getNumeroDeSerie(), "232320-0");
		
		List<Filme> filmesEncontrados = locadora.buscarFilmePorEspecificacao(new Especificacao("2012", "Joss Whedon", "Chris Evans", "Sinopse Teste 2", "3 Horas", "Ação"));
		
		assertEquals(filmesEncontrados.get(0).getEspec().getAtor(), "Chris Evans");
	}
}


