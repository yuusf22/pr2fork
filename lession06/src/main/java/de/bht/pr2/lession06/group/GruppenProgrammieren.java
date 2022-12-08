package de.bht.pr2.lession06.group;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GruppenProgrammieren {
	
	//------------------------------
	// Globale Variable
	private static Map<String, Fahrten> besitzerZuFahrten = null;
	
	//------------------------------
	// Methoden
	private static void fahrtenEinlesen() {
		// Globale Variable initialisieren
		besitzerZuFahrten = new HashMap<String, Fahrten>();
		
		try {
			// fahrten.txt-Datei einrichten
			FileInputStream fis = new FileInputStream("gruppen_rohdaten/fahrten.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);
			
			// Die Datei einlesen
			// und Fahrten-Objekte erzeugen bzw. ergaenzen
			String line = "";
			while ((line = br.readLine()) != null){
				String[] tokens = line.split("\\t");
				String besitzer = tokens[0];
				String ziel = tokens[1];
				int entfernung = Integer.parseInt(tokens[2]);
				
				if (!besitzerZuFahrten.containsKey(besitzer)) {
					besitzerZuFahrten.put(besitzer, new Fahrten());
				}
				
				besitzerZuFahrten.get(besitzer).fahren(ziel, entfernung);
			}
			
			// Aufraeumen
			br.close();
			isr.close();
			fis.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void fahrtenSerialisieren() {
		try {
			// Besitzer fuer Besitzer durchlaufen
			for (String besitzer : besitzerZuFahrten.keySet()) {
				FileOutputStream fos = new FileOutputStream("gruppen_serialisiert/" + besitzer + ".ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				// Fahrten-Objekt ausgeben
				oos.writeObject(besitzerZuFahrten.get(besitzer));

				// Aufraeumen
				oos.close();
				fos.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		fahrtenEinlesen();
		fahrtenSerialisieren();
	}
}
