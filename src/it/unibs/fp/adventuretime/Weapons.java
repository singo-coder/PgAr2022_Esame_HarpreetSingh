package it.unibs.fp.adventuretime;
import it.unibs.fp.mylib.*;
public class Weapons {
		static Arma pugno = new Arma("pugno", 1 );
		static Arma mitra = new Arma("mitraglietta fortnite", EstrazioniCasuali.estraiIntero(35, 55) );
		static Arma pugnale = new Arma("pugnale avvelenato", EstrazioniCasuali.estraiIntero(35, 55));
		static Arma libro = new Arma("libro di algebra", EstrazioniCasuali.estraiIntero(35, 55));
		static Arma lancia = new Arma("lancia sparafuoco", EstrazioniCasuali.estraiIntero(35, 55));

		public Arma scegliArma(int sceltaArma){
			Arma a=new Arma();
			switch(sceltaArma) {
			case 1:
				a=mitra;
			case 2:
				a=pugnale;
			case 3:
				a= libro;
			case 4:
				a = lancia;
			}
			return a;
		}
		
		
		public static Arma scegliArmaCasuale(){
			int sceltaArma = EstrazioniCasuali.estraiIntero(1, 5);
			Arma arma = new Arma(null,0);
			switch(sceltaArma) {
			case 1:
				arma = mitra;
			case 2:
				arma = pugnale;
			case 3:
				arma = libro;
			case 4:
				arma = lancia;
			}
			return arma;
		}
	}
