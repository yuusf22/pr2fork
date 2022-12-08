package de.bht.pr2.lession06.example04;

import java.io.Serializable;

public class Navi implements Serializable {
	//------------------------------
	// Attribute
	private static final long serialVersionUID = 3111992515588084795L;
	String marke = "unbekannt";
	String stimme = "weiblich"; // maennlich oder weiblich
	
	//------------------------------
	// Konstruktor
	public Navi(String marke, String stimme){
		this.marke = marke;
		this.stimme = stimme;
	}

	//------------------------------
	// Methode
	public void leiten(String adresse) {
		System.out.println("Die Route nach " + adresse + " wird gesucht...");
		System.out.println("Die Route ist gefunden.");
		System.out.println("Bitte in 300 Metern links abbiegen.");
	}
	
	public String toString() {
		return "Ein Navi, Marke " + marke + ", Stimme " + stimme;
	}
}
