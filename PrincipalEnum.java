package avFormativa.desafios;

public class PrincipalEnum {
	public static void main(String[] args) {
		for (ExemploEnum dia : ExemploEnum.values()) {
			System.out.println("Dia: " + dia);
		}
	}
}
