package Aula06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Tabuada t = new Tabuada();
		TabuadaSimplificada ts = new TabuadaSimplificada();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = entrada.nextInt();
		t.setNumero(numero);
		ts.setNumero(numero);
		
		t.soma();
		t.subtracao();
		t.divisao();
		t.multiplicacao();
		
		ts.soma();
		ts.subtracao();
		ts.divisao();
		ts.multiplicacao();
	}

}
