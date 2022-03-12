package ExercicioAula03;

public class Vendedor {
	public String nome;
	public int matricula;
	public double salarioInicial;
	public double salarioFinal;
	public double vendas;
	
	public void calculaSalarioFinal(){
		salarioFinal =  salarioInicial + vendas*0.15;
	}
	
	public void imprimeVendedor() {
		System.out.println("Vendedor: " + nome 
				+ "\nSalario Inicial: " + salarioInicial
				+ "\nSalario Final: " + salarioFinal);

	}
}
