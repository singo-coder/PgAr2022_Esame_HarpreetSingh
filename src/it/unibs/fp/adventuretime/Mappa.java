package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.InputDati;

public class Mappa {
	public static boolean IsMuro(char a) {
		boolean ris;
		if(a!='#') {
			ris=true;
		}else {
			ris=false;
		}
		return ris;
	}
	
	public static boolean IsMostro(char a) {
		boolean ris=true;
		if(a!='M') {
			ris=false;
		}
		return ris;
	}
	
	public static boolean IsCassa(char a) {
		boolean ris=true;
		if(a!='C') {
			ris=false;
		}
		return ris;
	}
	
	public static void stampaMap(char[][] mappa) {
		for(int i=0;i<22;i++) {	
			for(int j=0;j<31;j++) {
				System.out.print(mappa[i][j]+" ");
			}
			System.out.println("   "+i+"  \n");
		}
	}
	
	public static void inizio_viaggio(char[][] mappa, String player_name) {
		int posX=0,posY=0;
		boolean perdita=false;
		
		for(int i=0;i<22;i++) {
			for(int j=0;j<31;j++) {
				if(mappa[i][j]=='O') {
					posX=i;
					posY=j;
				}
			}
		}
		
		System.out.println("Posizione iniziale: "+ posX + "," + posY);
		
		Personaggio p=new Personaggio(player_name,posX,posY);
		
		
		
		do{
			char scelta=' ';
			Mappa.stampaMap(mappa);
			System.out.println("W-Muoviti in avanti");
			System.out.println("D-Muoviti a destra");
			System.out.println("A-Muoviti a sinistra");
			System.out.println("S-Muoviti in basso");
			scelta=InputDati.leggiChar("Cosa vuoi fare?");
			switch(scelta){
			//VAI AVANTI
			case 'W':
			case 'w':
				if((posX-1)==-1) {
					System.out.println("Attenzione! Movimento non possibile! Fine della mappa raggiunto.");
				}else {
					if(!Mappa.IsMuro(mappa[posX-1][posY])){
						System.out.println("Attenzione! Movimento non possibile! C'è un muro!");
					}else {
						if(IsMostro(mappa[posX-1][posY])) {
							if(!Scontro.generaScontro(p,posX,posY)) {
								perdita=true;
							}else {
								mappa[posX][posY]='.';
								mappa[posX-1][posY]='O';
								posX=posX-1;
							}

						}else {
								mappa[posX][posY]='.';
								mappa[posX-1][posY]='O';
								posX=posX-1;
						}
						
						System.out.println(posX+" "+posY);
					}
				}
				//p.pos.setX(posX-1);
			break;
			//RUOTA A DX
			case 'D':
			case 'd':
				if((posY+1)==31) {
					System.out.println("Attenzione! Movimento non possibile! Fine della mappa raggiunto.");
				}else {
					if(!Mappa.IsMuro(mappa[posX][posY+1])){
						System.out.println("Attenzione! Movimento non possibile! C'è un muro!");
					}else {
						mappa[posX][posY]='.';
						mappa[posX][posY+1]='O';
						posY=posY+1;
						System.out.println(posX+" "+posY);
					}
				}
			break;
			//
			case 'S':
			case 's':
				if((posX+1)==22) {
					System.out.println("Attenzione! Movimento non possibile! Fine della mappa raggiunto.");
				}else {
					if(!Mappa.IsMuro(mappa[posX+1][posY])){
						System.out.println("Attenzione! Movimento non possibile! C'è un muro!");
					}else {
						mappa[posX][posY]='.';
						mappa[posX+1][posY]='O';
						posX=posX+1;
						System.out.println(posX+" "+posY);
					}
				}
			break;
			//RUOTA A SX
			case 'A':
			case 'a':
				if((posY-1)==-1) {
					System.out.println("Attenzione! Movimento non possibile! Fine della mappa raggiunto.");
				}else {
					if(!Mappa.IsMuro(mappa[posX][posY-1])){
						System.out.println("Attenzione! Movimento non possibile! C'è un muro!");
					}else {
						mappa[posX][posY]='.';
						mappa[posX][posY-1]='O';
						posY=posY-1;
						System.out.println(posX+" "+posY);
					}
				}	
				/*mappa[posX][posY]='.';
				mappa[posX][posY-1]='O';
				posY=posY-1;*/
			break;
			case 9:
			break;
			default:
				System.out.println("Inserire una delle scelte indicate!!");
			break;
		}
		}while(!perdita);
	}
	
	
}
