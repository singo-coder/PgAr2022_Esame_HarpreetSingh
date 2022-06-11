package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.EstrazioniCasuali;

public class Mostro extends Entita{

	
	public Mostro(String nome,int x, int y) {
		super(nome, EstrazioniCasuali.estraiIntero(15, 25), 5, 5, x, y, Weapons.scegliArmaCasuale());
	}
	@Override
	public String toString() {
		return "\n" + getNome() + " (HP Mostro:" + getVita()+")";
	}
	
	

}
