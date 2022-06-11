package it.unibs.fp.adventuretime;

import java.util.*;

import it.unibs.fp.mylib.EstrazioniCasuali;

public class Scontro {
		static ArrayList<Mostro> elenco=new ArrayList<Mostro>();
	
		public static boolean generaScontro(Personaggio p, int x,int y) {
			int posx=x;
			int posy=y;
			Mostro m=generaMostro(posx,posy);
			System.out.println("OH NO! Ti sei imbattuto in "+m.getNome()+ "! E' un mostro pericoloso!");
			
			do {
				m.setVita(m.getVita()-(int)p.Danno());
				System.out.println(p.toString()+" ha colpito "+m.toString()+"\n\n");
				p.setVita(p.getVita()-(int)m.Danno());
				System.out.println(m.toString()+" ha colpito "+p.toString()+"\n\n");
				
			}while(p.getVita() > 0 && m.getVita() > 0);
			
			if(m.getVita() > 0) {
				System.out.println("Oh No! Sei morto!");
				return false;
			}else{
				System.out.println("Bravo! hai sconfitto quel mostro come si deve!");
				return true;
			}
		}
		
		public static Mostro generaMostro(int x,int y) {
			int k=EstrazioniCasuali.estraiIntero(1, 6);
			elenco.add(new Mostro("Albino",x,y));
			elenco.add(new Mostro("alfredo",x,y));
			elenco.add(new Mostro("giorgio",x,y));
			elenco.add(new Mostro("Antonio",x,y));
			elenco.add(new Mostro("Kevin",x,y));
			elenco.add(new Mostro("Fresco",x,y));
			
			return elenco.get(k);
			
			
		}
		

	}
