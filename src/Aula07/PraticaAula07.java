package Aula07;

import java.util.ArrayList;

public class PraticaAula07 {

	public static void main(String[] args) {
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		Aluno alunoCompleto = new Aluno("Renan Costa","renan.filgueiras@ceub.edu.br",123456);
		
		turma.add(alunoCompleto);
		
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
