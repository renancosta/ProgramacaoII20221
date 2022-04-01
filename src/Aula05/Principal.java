package Aula05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		//Criando objeto da classe
//		NumeroAleatorio numA;
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Informe o número máximo a ser gerado: ");
//		numA = new NumeroAleatorio(entrada.nextInt());
//		
//		System.out.println(numA.gerarNumero());
//		
//		numA.geraJogoMegaSena(8);
//		System.out.println(" ");
//		numA.geraLotoFacil();
//		System.out.println(" ");
//		System.out.println("Informe a quantidade de jogos a ser gerada");
//		int max = entrada.nextInt();
//		for(int i=0;i<max;i++) {
//			numA.geraJogoMegaSena(6);
//			System.out.println(" ");
//		}
		
		int i = 0;
		for(;;) {
			if(i==100)
				break;
			System.out.println(i);
			i++;
		}
		
		for(int j=0;;) {
			if(j==100)
				break;
			System.out.println(j);
			j++;
		}
		
		int k=0;
		for(;k<100;) {
			System.out.println(k);
			k++;
		}
		
	}
	
}
