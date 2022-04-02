package Aula06;

public class Foreach {

	public static void main(String[] args) {
		int[] vetor = {52,40,30,25,58};
		String[] vetorS = {"Renan", "João", "Pedro", "Maria"};
		int[][] predio = {{101,102,103},{201,202,203},{301,302,303}};
		
		//Vetor Int
		for(int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
		
		for(int elemento:vetor) {
			System.out.println(elemento);
		}
		
		//Vetor String
		for(int i=0;i<vetorS.length;i++) {
			System.out.println(vetorS[i]);
		}
		
		for(String elemento:vetorS) {
			System.out.println(elemento);
		}
		
		//Imprimindo todos os apartamentos em ordem
		for(int i=0;i<predio.length;i++) {
			for(int j=0;j<predio.length;j++) {
				System.out.println(predio[i][j]);
			}
		}
		
		//Imprimindo os primeiros apartamentos em cada andar
		for(int i=0;i<predio.length;i++) {
			for(int j=0;j<1;j++) {
				System.out.println(predio[i][j]);
			}
		}
		for(int i=0;i<predio.length;i++) {
			System.out.println(predio[i][0]);
		}
	}

}
