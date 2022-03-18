package Aula04;

public class Vendedor {
	private String nome;
	private int matricula;
	private double salarioInicial;
	private double salarioFinal;
	private double vendas;
	
	public Vendedor() {
		geraMatricula();
	}
	public Vendedor(String nome) {
		this.nome = nome;
		geraMatricula();
	}
	public Vendedor(String nome, double salarioInicial, double vendas){
		this.nome = nome;
		this.salarioInicial = salarioInicial;
		this.vendas = vendas;
		geraMatricula();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioInicial() {
		return salarioInicial;
	}
	
	public void setSalarioInicial(double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}
	
	public double getVendas() {
		return vendas;
	}
	
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void calculaSalarioFinal(){
		salarioFinal =  salarioInicial + vendas*0.15;
	}
	
	public void imprimeVendedor() {
		System.out.println("Vendedor: " + nome 
				+ "\nSalario Inicial: " + salarioInicial
				+ "\nSalario Final: " + salarioFinal
				+ "\nMatrícula: "+matricula);

	}
	
	public void geraMatricula() {
		matricula = ((int)(Math.random()*1000000));
	}
}
