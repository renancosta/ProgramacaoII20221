package Aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastraVendedorComTela {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Vendedor vendedor1 = new Vendedor();
		String nome;
		double salarioInicial, vendas;

		//Usando vendedor método construtor vazio
		JOptionPane.showMessageDialog(null, "Bem-vindo");
		
		nome = JOptionPane.showInputDialog("Informe o nome do vendedor");
		vendedor1.setNome(nome);
		
		salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do vendedor"));
		vendedor1.setSalarioInicial(salarioInicial);

		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe as vendas do vendedor"));
		vendedor1.setVendas(vendas);
		
		vendedor1.calculaSalarioFinal();
		
		JOptionPane.showConfirmDialog(null, "Vendedor: " + vendedor1.getNome() 
				+ "\nSalario Inicial: " + vendedor1.getSalarioInicial()
				+ "\nSalario Final: " + vendedor1.getSalarioFinal()
				+ "\nMatrícula: "+vendedor1.getMatricula());
		
		JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
	}

}
