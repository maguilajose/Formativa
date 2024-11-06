package avFormativa.desafios;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa2 jogador1 = new Pessoa2();
		Pessoa2 jogador2 = new Pessoa2 ("Messi",36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());	
	}
}
