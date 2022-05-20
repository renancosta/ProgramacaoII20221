package Aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Mamifero rato = new Rato();
		Mamifero cachorro = new Cachorro();
		Mamifero elefante = new Elefante();
		elefante.classe();
		
		System.out.println(rato.classe()+rato.obterCotaDiariaDeLeite());
		System.out.println(cachorro.classe()+cachorro.obterCotaDiariaDeLeite());
		System.out.println(elefante.classe()+elefante.obterCotaDiariaDeLeite());

	}

}
