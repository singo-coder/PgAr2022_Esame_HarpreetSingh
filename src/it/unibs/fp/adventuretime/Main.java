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
		
		//String player=InputDati.leggiStringa("Ciao!! Come ti chiami avventuriero?");
		
		for(int i=0;i<22;i++) {
			for(int j=0;j<31;j++) {
				if(mappa[i][j]=='O') {
					posX=i;
					posY=j;
				}
			}
		}
		
		System.out.println("POsizione iniziale: "+ posX + "," + posY);
		
		do{
			stampaMap(mappa);
			
		}while(scelta!=9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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

	
	

}