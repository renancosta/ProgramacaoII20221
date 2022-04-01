package Aula05;

public class NumeroAleatorio {
	private int numMax;
	
	public NumeroAleatorio() {
		
	}
	
	public NumeroAleatorio(int numMax) {
		this.numMax = numMax;
	}
	
	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	public int gerarNumero() {
		int num = (int)(Math.random() * numMax);
		return num;
	}
	
	public void geraJogoMegaSena(int nMax) {
		for(int i=0;i<nMax;i++) {
			System.out.print((int)(Math.random() * 60)+" ");
		}
	}
	
	public void geraLotoFacil() {
		for(int i=0;i<15;i++) {
			System.out.print((int)(Math.random() * 25)+" ");
		}
	}
}
