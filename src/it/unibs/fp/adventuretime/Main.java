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
		String player_name=InputDati.leggiStringa("Ciao!! Come ti chiami avventuriero?");
		Mappa.inizio_viaggio(mappa,player_name);
		
	}
}