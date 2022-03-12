package Aula2;

public class NovoPrograma {

	public static void main(String[] args) {
		
		//Declaração com atribuição
		int var1 = 3;
		
		//Declaração co atribuição a parte
		int var2,var3 = 5;
		var2 = 10;
		
		System.out.printf("Variável 1: %d\nVariável 2: %d\nVariável 3: %d",var1,var2,var3);
		System.out.println("\nVariável 1: "+var1+"\nVariável 2: "+var2+
				"\nVariável 3: "+var3);
		System.out.println("\n"+(var1-=var2+var3));
	}

}
