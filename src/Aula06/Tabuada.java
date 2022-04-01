package Aula06;

public class Tabuada {
	private int numero;
	
	public Tabuada() {
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void soma() {
		System.out.println("Tabuada Soma");
		System.out.println(numero+" + 1 = "+(numero+1));
		System.out.println(numero+" + 2 = "+(numero+2));
		System.out.println(numero+" + 3 = "+(numero+3));
		System.out.println(numero+" + 4 = "+(numero+4));
		System.out.println(numero+" + 5 = "+(numero+5));
		System.out.println(numero+" + 6 = "+(numero+6));
		System.out.println(numero+" + 7 = "+(numero+7));
		System.out.println(numero+" + 8 = "+(numero+8));
		System.out.println(numero+" + 9 = "+(numero+9));
		System.out.println(numero+" + 10 = "+(numero+10));
	}
	
	public void subtracao() {
		System.out.println("Tabuada Subtração");
		for(int i=1;i<11;i++) {
			System.out.println(numero+" - "+i+" = "+(numero-i));
		}
	}
	
	public void multiplicacao() {
		System.out.println("Tabuada Multiplicação");
		for(int i=1;i<11;i++) {
			System.out.println(numero+" * "+i+" = "+(numero*i));
		}
	}
	
	public void divisao() {
		System.out.println("Tabuada Divisão");
		for(int i=1;i<11;i++) {
			System.out.println(numero+" / "+i+" = "+(numero/i));
		}
	}
}
