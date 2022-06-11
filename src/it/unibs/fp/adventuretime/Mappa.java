package it.unibs.fp.adventuretime;

public class Mappa {
	public boolean muro(char a) {
		boolean ris=true;
		if(a=='#') {
			ris=false;
		}
		return ris;
	}
	
	public boolean IsMostro(char a) {
		boolean ris=true;
		if(a!='M') {
			ris=false;
		}
		return ris;
	}
	
	public boolean IsCassa(char a) {
		boolean ris=true;
		if(a!='C') {
			ris=false;
		}
		return ris;
	}
}
