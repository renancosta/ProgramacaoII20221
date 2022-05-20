package Aula10;

public class Quadrado implements FiguraGeometrica,Coloracao {
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String getNomeFigura() {
		return "Quadrado";
	}

	@Override
	public double getArea() {
		return lado*lado;
	}

	@Override
	public double getPerimetro() {
		return lado*4;
	}

	@Override
	public String getColor() {
		return "Azul";
	}
	
}
