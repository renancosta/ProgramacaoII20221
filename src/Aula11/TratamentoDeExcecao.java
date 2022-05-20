package Aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecao {

	public static void main(String[] args) {
		
		try {
			System.out.println("N�mero: "+lerIntDoTeclado());
		}catch (Exception e) {
			System.out.println("N�mero inv�lido");
		}
		
		try {
		System.out.println("N�mero: "+lerIntDoTeclado());
		}catch (Exception e) {
			System.out.println("Valor n�o adequado");
		}
	}
	
	public static int lerIntDoTeclado() throws InputMismatchException{
		Scanner leitura = new Scanner(System.in);
		Integer num=null;
		System.out.println("Informe um valor inteiro: ");
		num = leitura.nextInt();
		return num;
	}
}
