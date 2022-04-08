package Aula07;

import javax.swing.JOptionPane;

public class AtribuiNota {

	public static void main(String[] args) {
		Disciplina disciplina[] = new Disciplina[10];
		double media, notaMaior=0, notaMenor=10,soma=0;
		String nome;
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		for(int i=0;i<disciplina.length;i++) {
			disciplina[i] = new Disciplina();
			disciplina[i].setNome(JOptionPane.showInputDialog("Informe o nome da disciplina "+(i+1)));
			disciplina[i].setNota(
					Double.parseDouble(
							JOptionPane.showInputDialog(
									"Informe a nota da disciplina "+(i+1))));
			if(notaMaior<disciplina[i].getNota()) {
				notaMaior = disciplina[i].getNota();
			}
			if(notaMenor>disciplina[i].getNota()) {
				notaMenor = disciplina[i].getNota();
			}
			soma += disciplina[i].getNota();
		}
		media = soma/disciplina.length;
		
		JOptionPane.showMessageDialog(null, "Menor Nota: "+notaMenor+
				"\nMaior Nota: "+notaMaior+
				"\nMédia das notas: "+media);
		
	}

}
