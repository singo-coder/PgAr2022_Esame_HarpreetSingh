package it.unibs.fp.adventuretime;

public class Posizione {
	//attributi
	private int x,y;
	//metodo costruttore di Posizione
	public Posizione(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//getter e setter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//to string
	@Override
	public String toString() {
		return "Posizione [x=" + x + ", y=" + y + "]\n";
	}
	
}