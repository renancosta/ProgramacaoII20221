package AtividadeDOJO.ComTela;

public class Aluno extends Pessoa {
	private Integer matricula;
	private String curso;

	public Aluno() {
		gerarMatricula();
	}

	public Aluno(Integer matricula, String curso) {
		super();
		this.matricula = matricula;
		this.curso = curso;
		gerarMatricula();
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void gerarMatricula() {
		this.matricula = (int)(Math.random()*7000000);
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+
				"\nCPF: "+cpf+
				"\nE-mail: "+email+
				"\nSexo: "+sexo+
				"\nIdade: "+idade+
				"\nMatricula: "+matricula+
				"\nCurso: "+curso;
	}
}
