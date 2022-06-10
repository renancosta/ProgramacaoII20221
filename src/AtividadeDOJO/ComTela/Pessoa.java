package AtividadeDOJO.ComTela;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String email;
	protected int idade;
	protected int sexo;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, String email, int idade, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

}
