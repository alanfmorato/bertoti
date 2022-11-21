
public class Item {
	
	private String numeroDeSerie;
	private String dataAquisicao;
	
	public Item(String numeroDeSerie, String dataAquisicao){
		this.numeroDeSerie = numeroDeSerie;
		this.dataAquisicao = dataAquisicao;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	public void setNumeroDeSerie(String novoNumeroDeSerie) {
		this.numeroDeSerie = novoNumeroDeSerie;
	}
	
	public String getDataAquisicao() {
		return dataAquisicao;
	}
	
	public void setDataAquisicao(String novaDataAquisicao) {
		this.dataAquisicao = novaDataAquisicao;
	}


}
