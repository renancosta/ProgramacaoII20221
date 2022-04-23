package Aula08;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Contato> listaContato = new ArrayList<Contato>();
	
	public void armazenaPessoa(String nome, int telefone, String email) {
		Contato contato = new Contato(nome,email,telefone);
		listaContato.add(contato);
	}
	void removePessoa(String nome) {
		listaContato.remove(buscaPessoa(nome));
	}
	
	public int buscaPessoa(String nome) {
		for(int i=0; i<listaContato.size();i++) {
			if(listaContato.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}
	public void imprimeAgenda() {
		for(Contato c:listaContato) {
			System.out.println("Nome: "+c.getNome()+
					"\nE-mail: "+c.getEmail()+
					"\nTelefone: "+c.getTelefone());
		}
	}
	public void imprimePessoa(int index) {
		System.out.println("Nome: "+listaContato.get(index).getNome()+
				"\nE-mail: "+listaContato.get(index).getEmail()+
				"\nTelefone: "+listaContato.get(index).getTelefone());
	}

}
