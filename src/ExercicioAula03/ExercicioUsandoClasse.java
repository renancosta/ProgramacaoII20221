package ExercicioAula03;

import java.util.Scanner;

public class ExercicioUsandoClasse {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Vendedor vendedor1 = new Vendedor();
		String nome;
		double salarioInicial, vendas;

		//Usando vendedor m?todo construtor vazio
		System.out.println("Informe o nome do vendedor: ");
		vendedor1.nome = leitura.nextLine();

		System.out.println("Informe o sal?rio do vendedor: ");
		vendedor1.salarioInicial = leitura.nextDouble();

		System.out.println("Informe as vendas do vendedor: ");
		vendedor1.vendas = leitura.nextDouble();
		
		vendedor1.calculaSalarioFinal();
		
		vendedor1.imprimeVendedor();
		leitura.nextLine();
		
		//Usando vendedor que ao criar passa par?metro
		System.out.println("Informe o nome do vendedor: ");
		nome = leitura.nextLine();
		
		System.out.println("Informe o sal?rio do vendedor: ");
		salarioInicial = leitura.nextDouble();

		System.out.println("Informe as vendas do vendedor: ");
		vendas = leitura.nextDouble();
		
		Vendedor vendedor2 = new Vendedor(nome, salarioInicial, vendas);
		
		vendedor2.calculaSalarioFinal();
		
		vendedor2.imprimeVendedor();
	}

}
