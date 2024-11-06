package avFormativa.desafios;

public class Pessoa4 {
	private String nome;
	private Coracao coracao;

	public Pessoa4(String nome, int coracao) {
		super();
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCoracao() {
		return coracao.getBatimentos();
	}
}
