package de.bht.pr2.lession06.group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fahrten implements Serializable {
	//------------------------------
	// Attribute
	private static final long serialVersionUID = -2616446756080808251L;
	private List<String> ziele = null;
	private List<Integer> entfernungen = null;
	
	//------------------------------
	// Konstruktor
	public Fahrten() {
		ziele = new ArrayList<String>();
		entfernungen = new ArrayList<Integer>();
	}
	
	//------------------------------
	// Methoden
	public void fahren(String ziel, int entfernung) {
		ziele.add(ziel);
		entfernungen.add(entfernung);
	}
	
	public int getEntfernung(int position) {
		return entfernungen.get(position);
	}
	
	public String getZiel(int position) {
		return ziele.get(position);
	}
}
