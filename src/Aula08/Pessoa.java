package Aula08;

public class Pessoa {
	protected String nome;
	protected String email;
	protected String cpf;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	public Pessoa(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
