package AtividadeDOJO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManterAluno {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public boolean cadastrarAluno() {
		try {
			alunos.add(pegarInformacoes());
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
	
	public boolean alterarAluno() {
		Scanner entrada = new Scanner(System.in);
		Aluno aluno;
		int num;
		
		listaAluno();
		System.out.println("Informe o número do aluno que deseja alterar: ");
		try {
			num = entrada.nextInt();
			aluno = pegarInformacoes();
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

	private Aluno pegarInformacoes() {
		Aluno aluno = new Aluno();
		String cpf;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe nome do aluno: ");
		aluno.setNome(entrada.nextLine());
		System.out.println("Informe e-mail: ");
		aluno.setEmail(entrada.nextLine());
		System.out.println("Informe idade: ");
		aluno.setIdade(entrada.nextInt());
		System.out.println("Informe o sexo (1- Feminino, 2- Masculino, 3- Outros: ");
		aluno.setSexo(entrada.nextInt());
		do {
			System.out.println("Informe o cpf: ");
			cpf = entrada.nextLine();
		}while(!Util.isCPF(cpf));
		aluno.setCpf(cpf);
		System.out.println("Informe o curso: ");
		aluno.setCurso(entrada.nextLine());
		return aluno;
	}
}
