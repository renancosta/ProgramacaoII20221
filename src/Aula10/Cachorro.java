package Aula10;

public class Cachorro extends Mamifero{

	@Override
	public double obterCotaDiariaDeLeite() {
		System.out.println(nomeAnimal());
		return 1;
	}

	@Override
	protected String nomeAnimal() {
		return "Cachorro: ";
	}

}
