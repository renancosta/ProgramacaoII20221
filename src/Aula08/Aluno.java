package Aula08;

public class Aluno extends Pessoa{
	private int matricula;
	private final boolean status = true;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String email,int matricula) {
		super(nome,email);
		this.matricula = matricula;
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
