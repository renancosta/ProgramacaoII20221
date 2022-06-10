package Aula11;

public class Teste {
	private static int num1=0;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public static void imprimeNum1() {
		try {
			System.out.println(num1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
