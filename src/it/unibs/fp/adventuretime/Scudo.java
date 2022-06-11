package it.unibs.fp.adventuretime;

public class Scudo extends Oggetto{
	private int punti_hp;

	public Scudo(int punti_hp) {
		super();
		this.punti_hp = punti_hp;
	}

	public int getPunti_hp() {
		return punti_hp;
	}

	public void setPunti_hp(int punti_hp) {
		this.punti_hp = punti_hp;
	}

	@Override
	public String toString() {
		return "\nVita Scudo: " + punti_hp;
	}
	
	
}
