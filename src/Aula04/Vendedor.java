package Aula04;

public class Vendedor {
	private String nome;
	private int matricula;
	private double salarioInicial;
	private double salarioFinal;
	private double vendas;
	
	public Vendedor() {
		
	}
	public Vendedor(String nome) {
		this.nome = nome;
	}
	
	public Vendedor(String nome, double salarioInicial, double vendas){
		this.nome = nome;
		this.salarioInicial = salarioInicial;
		this.vendas = vendas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calculaSalarioFinal(){
		salarioFinal =  salarioInicial + vendas*0.15;
	}
	
	public void imprimeVendedor() {
		System.out.println("Vendedor: " + nome 
				+ "\nSalario Inicial: " + salarioInicial
				+ "\nSalario Final: " + salarioFinal);

	}
}
