package avFormativa.desafios;

public class Principal3 {

	public static void main(String[] args) {
		PessoaFisica3 pessoa = new PessoaFisica3("Fulano", "15 1234-5678","1234-5678-99","1234-5678-99");
		System.out.println("Nome :" +pessoa.getNome());
		System.out.println("Telefone :" +pessoa.getTelefone());
		System.out.println("CPF :" +pessoa.getCpf());
		System.out.println("Nome :" +pessoa.getRg());
	}
}
