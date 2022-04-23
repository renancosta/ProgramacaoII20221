package Aula08;

public class Professor extends Pessoa{
	private int matricula;
	
	public Professor() {
		
	}
	public Professor(String nome, String email,int matricula) {
		super(nome,email);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
