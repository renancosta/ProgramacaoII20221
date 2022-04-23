package Aula08;

import java.util.ArrayList;

public class PraticaAula08 {

	public static void main(String[] args) {
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		Aluno alunoCompleto = new Aluno("Renan Costa","renan.filgueiras@ceub.edu.br",123456);
		Aluno alunoCompleto2 = new Aluno("José","jose@ceub.edu.br",654321);
		
		turma.add(alunoCompleto);
		turma.add(alunoCompleto2);
		
		for(Aluno aluno:turma) {
			System.out.println("Nome: "+aluno.getNome()+
								"\nE-mail: "+aluno.getEmail()+
								"\nMatrícula: "+aluno.getMatricula());
		}
		
		turma.forEach(aluno -> {
			System.out.println("Nome: "+aluno.getNome()+
					"\nE-mail: "+aluno.getEmail()+
					"\nMatrícula: "+aluno.getMatricula());

		});
		
		System.out.println(turma);

	}

}
