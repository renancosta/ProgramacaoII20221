package Aula10;

import java.util.ArrayList;

public class PrincipalFigura {

	public static void main(String[] args) {
		Quadrado q = new Quadrado();
		q.setLado(5);
		Triangulo t = new Triangulo(5, 10, 10, 10, 10);
		
		System.out.println("Figura: "+q.getNomeFigura()+
				"\nPerimetro: "+q.getPerimetro()+
				"\n¡rea: "+q.getArea());
		System.out.println("Figura: "+t.getNomeFigura()+
				"\nPerimetro: "+t.getPerimetro()+
				"\n¡rea: "+t.getArea());
	}

}
