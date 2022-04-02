package Aula06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Tabuada t = new Tabuada();
		TabuadaSimplificada ts = new TabuadaSimplificada();
		Scanner entrada = new Scanner(System.in);
		int numero;
		String opcao;
		
		do{
			System.out.println("Informe um número: ");
			numero = entrada.nextInt();
			t.setNumero(numero);
			ts.setNumero(numero);
			
			System.out.println("Escolha um operação a ser realizada");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Todas as operações");
			System.out.println("6 - Sair");
			entrada.nextLine();
			opcao = entrada.nextLine();
			
			switch(opcao) {
				case "1":
					t.soma();
					break;
				case "2":
					t.subtracao();
					break;
				case "3":
					t.multiplicacao();
					break;
				case "4":
					t.divisao();
					break;
				case "5":
					ts.soma();
					ts.subtracao();
					ts.divisao();
					ts.multiplicacao();
					break;
				case "6":
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		}while(!opcao.equals("6"));
	}

}
