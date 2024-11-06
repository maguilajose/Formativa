package avFormativa.desafios;

public class PrincipalListaMercado {

	public static void main(String[] args) {
		for (ListaMercado alimento : ListaMercado.values()) {
	//estrutura de repeticao, dentro dele tem o Enum como nome de alimento, values retorna os valores da lista 
			System.out.println("Produto: " + alimento);
		//mostra os valores da lista
		}
	}
}
