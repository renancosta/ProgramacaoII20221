package Aula08;

public class PrincipalAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa("Renan", 1234, "renan@gmail.com");
		agenda.armazenaPessoa("João", 4321, "joao@gmail.com");
		
		agenda.imprimeAgenda();
		
		agenda.removePessoa("Renan");
		
		agenda.imprimeAgenda();
	}
}
