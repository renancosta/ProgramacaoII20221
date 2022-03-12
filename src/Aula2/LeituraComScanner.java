package Aula2;

import java.util.Scanner;

public class LeituraComScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, sobrenome;
		int idade;
		
		System.out.println("Informe o seu nome: ");
		nome = entrada.next();
		System.out.println("Informe o seu sobrenome: ");
		sobrenome = entrada.next();
		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Nome completo: "+nome+" "+sobrenome+"\n Falta "+
		(100-idade)+" anos para completar 100 anos");
		System.out.printf("Nome completo: %s %s\n Falta %d anos para completar 100 anos",nome,sobrenome,(100-idade));
		
	}

}
