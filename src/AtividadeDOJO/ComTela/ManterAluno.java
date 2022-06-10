package AtividadeDOJO.ComTela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManterAluno {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public boolean cadastrarAluno(Aluno aluno) {
		try {
			alunos.add(aluno);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public boolean excluirAluno() {
		Scanner entrada = new Scanner(System.in);
		int num;
		listaAluno();
		System.out.println("Informe o número do aluno que deseja excluir: ");
		try {
			num = entrada.nextInt();
			alunos.remove(num-1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void listaAluno() {
		for(int i=0;i<alunos.size();i++) {
			System.out.println((i+1)+" - "+alunos.get(i).getMatricula()+" - "+alunos.get(i).getNome());
		}
	}
	
	public boolean alterarAluno(Aluno aluno) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		listaAluno();
		System.out.println("Informe o número do aluno que deseja alterar: ");
		try {
			num = entrada.nextInt();
			alunos.remove(num-1);
			alunos.add(aluno);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean buscarAluno(String texto) {
		boolean achou=false;
		if(texto.length()<=7) { 
			for(int i=0;i<alunos.size();i++) {
				if(alunos.get(i).getMatricula().equals(texto)) {
					imprimirAluno(alunos.get(i));
					achou=true;
				}
			}
		} else {
			for(int i=0;i<alunos.size();i++) {
				if(alunos.get(i).getNome().equals(texto)) {
					imprimirAluno(alunos.get(i));
					achou=true;
				}
			}
		}
		
		return achou;
	}
	
	private void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.toString());
	}
}
