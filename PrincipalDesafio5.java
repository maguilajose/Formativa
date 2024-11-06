package avFormativa.desafios;

public class PrincipalDesafio5 {

	public static void main(String[] args) {
		Lobo3 lobo = new Lobo3("Lobo mau","F","Cinza");
		Leao leao = new Leao("Mufasa","M","Brabo");
		
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
	}

}
