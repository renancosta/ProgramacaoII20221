package ExercicioAula03;

import java.util.Scanner;

public class ExercicioUsandoClasse {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Vendedor vendedor1 = new Vendedor();

		System.out.println("Informe o nome do vendedor: ");
		vendedor1.nome = leitura.nextLine();

		System.out.println("Informe o salário do vendedor: ");
		vendedor1.salarioInicial = leitura.nextDouble();

		System.out.println("Informe as vendas do vendedor: ");
		vendedor1.vendas = leitura.nextDouble();
		
		vendedor1.calculaSalarioFinal();
		
		vendedor1.imprimeVendedor();
	}

}
