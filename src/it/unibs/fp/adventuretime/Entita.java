package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.*;

public abstract class Entita {
	private String nome;
	private int vita;
	private int atk;
	private int def;
	private double modificatore;
	Posizione pos;
	private Arma a;
	
	
	public Entita(String nome, int vita, int atk, int def, int x,int y) {
		super();
		this.nome = nome;
		this.vita = vita;
		this.atk = atk;
		this.def = def;
		this.pos = new Posizione(x,y);
	}
	
	public Arma getA() {
		return a;
	}

	public void setA(Arma a) {
		this.a = a;
	}
	
	
	public double getModificatore() {
		return modificatore;
	}

	public void setModificatore(double modificatore) {
		this.modificatore = modificatore;
	}

	public double GetModificatore() {
		 int p = EstrazioniCasuali.estraiIntero(1, 100);
		 if(p<= 7.5) 
			 setModificatore(1.5);
		 else 
			 setModificatore(1);
		 
		 return modificatore;
	}
	
	public double Danno() {
		double danno;
		danno=((2*a.getPotenza()*atk)/(25*def))+2*modificatore;
		return danno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVita() {
		return vita;
	}
	public void setVita(int vita) {
		this.vita = vita;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	public Posizione getPos() {
		return pos;
	}
	
	public void setPos(int x, int y) {
		pos.setX(x);
		pos.setY(y);
	}
	
}
	
