package it.unibs.fp.adventuretime;

public class Personaggio extends Entita {
	private Inventario i;
	
	public Personaggio(String nome,int x, int y) {
		super(nome, 20, 5, 5, x, y,new Arma("pugno",1));
	}
	
	public String toString() {
		return getNome() + "\nHP Personaggio: " + getVita();
	}
}
