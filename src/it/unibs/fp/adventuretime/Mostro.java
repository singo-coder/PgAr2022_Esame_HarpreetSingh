package it.unibs.fp.adventuretime;

public class Mostro extends Entita{

	
	public Mostro(String nome, int vita, int atk, int def, int x, int y, Arma a) {
		super(nome, vita, atk, def, x, y);
	}
	@Override
	public String toString() {
		return "\nNome Mostro: " + getNome() + "\nHP Mostro" + getVita();
	}
	
	

}
