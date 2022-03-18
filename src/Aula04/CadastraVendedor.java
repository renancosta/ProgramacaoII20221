package Aula04;

import java.util.Scanner;

import Aula04.Vendedor;

public class CadastraVendedor {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Vendedor vendedor1 = new Vendedor();
		String nome;
		double salarioInicial, vendas;

		//Usando vendedor método construtor vazio
		System.out.println("Informe o nome do vendedor: ");
		vendedor1.setNome(leitura.nextLine());
		
		System.out.println("Informe o salário do vendedor: ");
		vendedor1.salarioInicial = leitura.nextDouble();

		System.out.println("Informe as vendas do vendedor: ");
		vendedor1.vendas = leitura.nextDouble();
		
		vendedor1.calculaSalarioFinal();
		
		vendedor1.imprimeVendedor();
		leitura.nextLine();

	}

}
