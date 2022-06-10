package Aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecao {

	public static void main(String[] args) {
		
		try {
			System.out.println("Número: "+lerIntDoTeclado());
		}catch (Exception e) {
			System.out.println("Número inválido");
		}
		
		try {
		System.out.println("Número: "+lerIntDoTeclado());
		}catch (Exception e) {
			System.out.println("Valor não adequado");
		}
	}
	
	/**
	 * Método para leitura de um inteiro do teclado
	 * Não tem parâmetro
	 * @return É numero que o usuário informou
	 * @throws InputMismatchException
	 */
	public static int lerIntDoTeclado() throws InputMismatchException{
		Scanner leitura = new Scanner(System.in);
		Integer num=null;
		System.out.println("Informe um valor inteiro: ");
		num = leitura.nextInt();
		return num;
	}
}
