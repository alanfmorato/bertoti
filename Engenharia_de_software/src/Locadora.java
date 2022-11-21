import java.util.LinkedList;
import java.util.List;

public class Locadora {
	
	private List<Filme>filmes = new LinkedList<Filme>();
	private List<Item>itens = new LinkedList<Item>();
	
	public void cadastrarFilme(Filme filme){
		filmes.add(filme);
	}
	public void cadastrarItem(Item item){
		itens.add(item);
	}
	
	public List<Filme> getFilme() {
		return filmes;
	}

	public void setFilme(List<Filme> filme) {
		this.filmes = filme;
	}
	
	public List<Item> getItem() {
		return itens;
	}

	public void setItem(List<Item> item) {
		this.itens = item;
	}
	
	
	public List<Filme> buscarFilmePorEspecificacao(Especificacao espec){
        List<Filme> filmesEncontrados = new LinkedList<Filme>();
        for(Filme filme:filmes){
             if(filme.getEspec().comparar(espec)) filmesEncontrados.add(filme);
        }
        return filmesEncontrados;
  }

  public Filme buscarFilmePorTitulo(String titulo){
       for(Filme filme:filmes){
            if(filme.getTitulo().equals(titulo)) return filme; 
       }
       return null;
  }
  
  public Item buscarItemPorNumeroDeSerie(String numeroDeSerie){
      for(Item item:itens){
           if(item.getNumeroDeSerie().equals(numeroDeSerie)) return item; 
      }
      return null;
 }


  public List<Filme> getLocadora(){
        return filmes;
  }
  
}
