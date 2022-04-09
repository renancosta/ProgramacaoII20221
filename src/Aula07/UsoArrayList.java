package Aula07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class UsoArrayList {
	public static void main(String[] args) {
		List<String> disciplinas = new ArrayList<String>();
		String nome = "Física 1";
		
		disciplinas.add("Cálculo 1");
		System.out.println(disciplinas);
		disciplinas.add(nome);
		System.out.println(disciplinas);
		disciplinas.add(JOptionPane.showInputDialog("Informe o nome da disciplina"));
		System.out.println(disciplinas);

		System.out.println(disciplinas);
		
		for(String disciplina:disciplinas) {
			System.out.println("Disciplina: "+disciplina);
		}
		
		for(int i=0;i<disciplinas.size();i++) {
			System.out.println("Disciplina: "+disciplinas.get(i));
		}
		
		disciplinas.forEach(disciplina ->{ 
			System.out.println("Disciplina: "+disciplina);
		});
		
		Collections.sort(disciplinas);
		
		System.out.println(disciplinas);
	}
}
