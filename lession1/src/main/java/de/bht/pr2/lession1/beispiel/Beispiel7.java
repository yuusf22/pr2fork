package de.bht.pr2.lession1.beispiel;

public class Beispiel7 {
	
	// Upgepruefte Ausnahme
	
	public static int divisionBerechnen(int zaehler) {
		// Kein throws ArithmeticException erforderlich,
		// weil sie ungeprueft ist
		int nenner = 0;
		int returnInt = zaehler / nenner;
		return returnInt;
	}

	public static void main(String[] args) {
		double division = 0d;
		
		try {
			divisionBerechnen(100);
		}
		catch (ArithmeticException e) {
			System.out.println("Irgendwo in divisionBerechnen()-Method ist die Mathe falsch");
			System.out.println(e);
			System.out.println("-----");
		}

		System.out.println("Ergebnis: " + division);
	}
}
