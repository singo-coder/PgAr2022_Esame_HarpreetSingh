package it.unibs.fp.adventuretime;
import java.io.*;
import java.util.*;

import javax.xml.stream.*;

import it.unibs.fp.mylib.InputDati;

public class Main {

	public static void main(String[] args) {
		char[][] mappa=new char [22][31];
		String lv1="livello1.xml";
		mappa=InputXML.creaMappa(lv1);
		int posX=0,posY=0;
		String player_name=InputDati.leggiStringa("Ciao!! Come ti chiami avventuriero?");
		
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
			stampaMap(mappa);
			System.out.println("Cosa vuoi fare?");
			System.out.println("W-Muoviti in avanti");
			System.out.println("D-Muoviti a destra");
			System.out.println("A-Muoviti a sinistra");
			System.out.println("S-Muoviti in basso");
			scelta=InputDati.leggiChar("Cosa vuoi fare?");
			switch(scelta){
			//VAI AVANTI
			case 'W':
			case 'w':
				mappa[posX][posY]='.';
				mappa[posX-1][posY]='O';
				posX=posX-1;
				//p.pos.setX(posX-1);
			break;
			//RUOTA A DX
			case 'D':
			case 'd':
				mappa[posX][posY]='.';
				mappa[posX][posY+1]='O';
				posY=posY+1;
			break;
			//
			case 'S':
			case 's':
				mappa[posX][posY]='.';
				mappa[posX+1][posY]='O';
				posX=posX+1;
			break;
			//RUOTA A SX
			case 'A':
			case 'a':	
				mappa[posX][posY]='.';
				mappa[posX][posY-1]='O';
				posY=posY-1;
			break;
			case 9:
			break;
			default:
				System.out.println("Inserire una delle scelte indicate!!");
			break;
		}

		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	//stampa la mappa
	public static void stampaMap(char[][] mappa) {
		for(int i=0;i<22;i++) {	
			for(int j=0;j<31;j++) {
				System.out.print(mappa[i][j]+" ");
			}
			System.out.println("   "+i+"  \n");
		}
	}
	
	public 

	
	

}