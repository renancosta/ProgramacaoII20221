package Aula2;

public class NovoPrograma {

	public static void main(String[] args) {
		
		//Declara��o com atribui��o
		int var1 = 3;
		
		//Declara��o co atribui��o a parte
		int var2,var3 = 5;
		var2 = 10;
		
		System.out.printf("Vari�vel 1: %d\nVari�vel 2: %d\nVari�vel 3: %d",var1,var2,var3);
		System.out.println("\nVari�vel 1: "+var1+"\nVari�vel 2: "+var2+
				"\nVari�vel 3: "+var3);
		System.out.println("\n"+(var1-=var2+var3));
	}

}
