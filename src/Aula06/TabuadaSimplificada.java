package Aula06;

public class TabuadaSimplificada {
	private int numero;
	
	public TabuadaSimplificada() {
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void soma() {
		operacaoBasica("Soma", '+');
	}
	
	public void subtracao() {
		operacaoBasica("Subtração", '-');
	}
	
	public void multiplicacao() {
		operacaoBasica("Multiplicação", '*');
	}
	
	public void divisao() {
		operacaoBasica("Divisão", '/');
	}
	
	private void operacaoBasica(String nome, char simbolo) {
		System.out.println("Tabuada "+nome);
		for(int i=1;i<11;i++) {
			System.out.print(numero+" "+simbolo+" "+i+" = ");
			if(simbolo=='+') {
				System.out.println(numero+i);
			} else if (simbolo=='-') {
				System.out.println(numero-i);
			} else if(simbolo=='/') {
				System.out.println(numero/i);
			}else {
				System.out.println(numero*i);
			}
		}
	}
}

