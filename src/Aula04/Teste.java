package Aula04;

import java.io.*;

interface Segunda {
	public void segunda();
}

interface Terca {
	public void terca();
}

interface Quarta extends Segunda, Terca {
	public void quarta();
}

class Quinta implements Segunda {
	public void segunda() {
		System.out.println("Segunda");
	}
}

class Sexta extends Quinta implements Quarta {
	public void segunda() {
		System.out.println("Segunda!");
	}

	public void terca() {
		System.out.println("Segunda!!");
	}

	public void quarta() {
		System.out.println("Segunda!!!");
	}
}

public class Teste {
	public static void main(String[] args) {
		Quinta dia = (Quinta) new Sexta();
		dia.segunda();
	}
}
