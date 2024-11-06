package avFormativa.desafios;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Motor motor = new Motor("Combustão Interna");
		Carro carro = new Carro("Fusca",motor.getTipo());
		
	}

}
