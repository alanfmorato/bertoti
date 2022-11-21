
public class Especificacao {
	
	private String anoLancamento;
	private String diretor;
	private String ator;
	private String sinopse;
	private String duracao;
	private String genero;
	
	
	public Especificacao(String anoLancamento, String diretor, String ator, String sinopse, String duracao, String genero) {
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.ator = ator;
		this.sinopse = sinopse;
		this.duracao = duracao;
		this.genero = genero;
	}
	
	public String getanoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String novoAnoLancamento) {
		this.anoLancamento = novoAnoLancamento;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String novoDiretor) {
		this.diretor = novoDiretor;
	}
	public String getAtor() {
		return ator;
	}
	public void setAtor(String novoAtor) {
		this.ator = novoAtor;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String novaSinopse) {
		this.sinopse = novaSinopse;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String novaDuracao) {
		this.duracao = novaDuracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}
	public boolean comparar(Especificacao especificacao){
		if(this.genero.equals(especificacao.genero) && this.sinopse.equals(especificacao.sinopse) 
				&& this.anoLancamento.equals(especificacao.anoLancamento) && this.duracao.equals(especificacao.duracao)
				&& this.ator.equals(especificacao.ator) && this.diretor.equals(especificacao.diretor)){
			return true;
		} else {
			return false;
		}
	}
}
