package avFormativa.desafios;

public class PrincipalPessoa {

	public static void main(String[] args) {
		 Pessoa pessoa1= new Pessoa();
		 Pessoa pessoa2= new Pessoa();
		 
		 pessoa1.setNome("Neymar");
		 pessoa1.setIdade(30);
		 pessoa1.setEndereco("RUA 123");
		 pessoa1.setProfissao("Jogador");
		 
		 pessoa2.setNome("Jacob");
		 pessoa2.setIdade(10);
		 pessoa2.setEndereco("RUA 123");
		 pessoa2.setProfissao("Louco");
		 
		 System.out.println(pessoa1.getNome());
		 System.out.println(pessoa1.getIdade());
		 System.out.println(pessoa1.getEndereco());
		 System.out.println(pessoa1.getProfissao());
		
		 System.out.println(pessoa2.getNome());
		 System.out.println(pessoa2.getIdade());
		 System.out.println(pessoa2.getEndereco());
		 System.out.println(pessoa2.getProfissao()); 
	}
}
