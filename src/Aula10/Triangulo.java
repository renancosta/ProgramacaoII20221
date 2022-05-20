package Aula10;

public class Triangulo implements FiguraGeometrica {

	private double altura;
	private double base;
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double altura, double base, double lado1, double lado2, double lado3) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String getNomeFigura() {
		return "Triângulo";
	}

	@Override
	public double getArea() {
		return (base*altura)/2;
	}

	@Override
	public double getPerimetro() {
		return lado1+lado2+lado3;
	}

}
