package it.unibs.fp.adventuretime;

public class Cesta {
	private Oggetto o;
	private Posizione p;
	
	
	
	public Cesta(Oggetto o, int x,int y) {
		super();
		this.p = new Posizione(x,y);
	}
	public Posizione getP() {
		return p;
	}
	public void setP(Posizione p) {
		this.p = p;
	}
	
	
	
	
}
