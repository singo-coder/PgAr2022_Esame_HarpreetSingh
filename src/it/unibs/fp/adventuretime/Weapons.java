package it.unibs.fp.adventuretime;
import it.unibs.fp.mylib.*;
public class Weapons {
		Arma mitra = new Arma("mitraglietta fortnite", EstrazioniCasuali.estraiIntero(35, 55) );
		Arma pugnale = new Arma("pugnale avvelenato", EstrazioniCasuali.estraiIntero(35, 55));
		Arma libro = new Arma("libro di algebra", EstrazioniCasuali.estraiIntero(35, 55));
		Arma lancia = new Arma("lancia sparafuoco", EstrazioniCasuali.estraiIntero(35, 55));

		/*public Arma scegliArma(){
			
			int sceltaArma=InputDati.leggiIntero("Scegli quale arma estrarre: \n",1,4);
			switch(sceltaArma) {
			case 1:
				return mitra;
			case 2:
				return pugnale;
			case 3:
				return libro;
			case 4:
				return lancia;
			}
		}*/
		
		public Arma scegliArmaCasuale(){
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
