package ExercicioAula03;

public class Vendedor {
	public String nome;
	public int matricula;
	public double salarioInicial;
	public double salarioFinal;
	public double vendas;
	
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
	
	public void calculaSalarioFinal(){
		salarioFinal =  salarioInicial + vendas*0.15;
	}
	
	public void imprimeVendedor() {
		System.out.println("Vendedor: " + nome 
				+ "\nSalario Inicial: " + salarioInicial
				+ "\nSalario Final: " + salarioFinal);

	}
}
