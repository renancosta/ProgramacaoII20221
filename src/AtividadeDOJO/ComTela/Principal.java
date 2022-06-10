package AtividadeDOJO.ComTela;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao;
		ManterAluno ma = new ManterAluno();

		do {

			System.out.println("Sistema Universitário");
			System.out.println("Manter aluno");
			System.out.println("1- Cadastrar o aluno");
			System.out.println("2- Buscar aluno por nome ou matrícula");
			System.out.println("3- Alterar dados do aluno");
			System.out.println("4- Excluir aluno");
			System.out.println("5- Listar alunos");
			System.out.println("6- Sair do sistema");
			System.out.println("Escolha uma opção do menu: ");

			opcao = entrada.nextLine();

			switch (opcao) {
			case "1":
				if (ma.cadastrarAluno()) {
					System.out.println("Aluno cadastrado com sucesso!");
				} else {
					System.out.println("Erro ao cadastrar o aluno!");
				}
				break;
			case "2":
				System.out.println("Informe um nome ou matrícula para buscar: ");
				if (ma.buscarAluno(entrada.nextLine()))
					System.out.println("Aluno");
				else
					System.out.println("Aluno não encontrado");
				break;
			case "3":
				if(ma.alterarAluno()){
					System.out.println("Aluno alterado com sucesso");
				}else {
					System.out.println("Não foi possível alterar o aluno informado");
				}
				break;
			case "4":
				if(ma.excluirAluno()) {
					System.out.println("Aluno excluído com sucesso");
				} else {
					System.out.println("Não foi possível excluir o aluno informado");
				}
				break;
			case "5":
				ma.listaAluno();
				break;
			case "6":
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (!opcao.equals("6"));
	}
}
