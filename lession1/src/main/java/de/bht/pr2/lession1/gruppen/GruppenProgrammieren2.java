package de.bht.pr2.lession1.gruppen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GruppenProgrammieren2 {

	// Wie kann man die rote Wellenlinie loeschen?

	public static void dateiOeffnen(String dateiName) throws FileNotFoundException {
		// throws ArithmeticException erforderlich,
		// weil sie geprueft ist
		FileInputStream file = new FileInputStream(dateiName);
		file.close();
	}

	public static void main(String[] args) {
		try {
			dateiOeffnen("Beispiel6.java");
		}
		catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
			System.out.println(e);
			System.out.println("-----");
		}
	}
}
