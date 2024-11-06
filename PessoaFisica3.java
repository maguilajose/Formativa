package avFormativa.desafios;

public class PessoaFisica3 extends Pessoa3 {
private String cpf;
private String rg;

public PessoaFisica3(String cpf, String rg, String nome, String telefone) {
	super(nome, telefone);
	this.cpf = cpf;
	this.rg = rg;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
}
