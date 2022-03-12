package ExercicioAula03;

import java.util.Scanner;

public class ExercicioAula03 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String nome;
		double salarioI,vendas,salarioFinal;
		
		System.out.println("Informe o nome do vendedor: ");
		nome = leitura.nextLine();
		
		System.out.println("Informe o salário do vendedor: ");
		salarioI = leitura.nextDouble();
		
		System.out.println("Informe as vendas do vendedor: ");
		vendas = leitura.nextDouble();
		
		salarioFinal = salarioI + vendas*0.15;
		
		System.out.println("Vendedor: "+nome
				+"\nSalario Inicial: "+salarioI
				+"\nSalario Final: "+salarioFinal);
	}

}
