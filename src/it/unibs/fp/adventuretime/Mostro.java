package it.unibs.fp.adventuretime;

public class Mostro extends Entita{

	
	public Mostro(String nome,int x, int y) {
		super(nome, 20, 5, 5, x, y, Weapons.scegliArmaCasuale());
	}
	@Override
	public String toString() {
		return "\n" + getNome() + "\nHP Mostro" + getVita();
	}
	
	

}
