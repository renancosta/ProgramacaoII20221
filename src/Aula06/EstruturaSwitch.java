package Aula06;

import java.util.Scanner;

public class EstruturaSwitch {
	public static void main(String[] args) {
		String opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um dia");
		System.out.println("1 - Segunda");
		System.out.println("2 - Terça");
		System.out.println("3 - Quarta");
		System.out.println("4 - Quinta");
		System.out.println("5 - Sexta");
		System.out.println("6 - Sabado");
		System.out.println("7 - Domingo");
		
		opcao = entrada.nextLine();
		
		switch(opcao) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
				System.out.println("Dia da semana");
				break;
			case "6":
			case "7":
				System.out.println("Final de semana");
				break;
			default:
				System.out.println("Dia inexistente");
		}
	}
}
