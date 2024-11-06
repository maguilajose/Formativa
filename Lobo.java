package avFormativa.desafios;

public class Lobo implements Animal {

	@Override //colocar função para os metodos - subescreve os metodos que estão em Animal
	public void dormir() {
		System.out.println("O lobo está dormindo.");
	}
	@Override
	public void caminhar() {
		System.out.println("O lobo está caminhando.");
	}
	@Override
	public void correr() {
		System.out.println("O lobo está correndo.");
	}
	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando.");
	}
}
