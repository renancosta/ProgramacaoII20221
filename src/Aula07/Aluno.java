package Aula07;

public class Aluno {
	private String nome;
	private String email;
	private int matricula;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String email, int matricula) {
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+
				"\nE-mail: "+email+
				"\nMatrícula: "+matricula;
	}
}
