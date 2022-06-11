package it.unibs.fp.adventuretime;

public class Scontro {
		
		public boolean generaScontro(Personaggio p, Mostro m ) {
			
		do {
			m.setVita(m.getVita()-(int)p.Danno());
			p.setVita(p.getVita()-(int)p.Danno());
		}while(p.getVita() > 0 && m.getVita() > 0);
		
		if(m.getVita() > 0) 
			return false;
		else 
			return true;
		}
		

	}
