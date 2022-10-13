package de.bht.pr2.lession1.beispiel;

public class Beispiel13 {

  // Stack-Trace

  public static void divisionBerechnen(int zaehler) throws ArithmeticException {
    int nenner = ((7 * 21) - 56) % 13; // Resultat von komplizierter Berechnung
    if (nenner == 0) {
      ArithmeticException e = new ArithmeticException("Nenner ist null");
      throw e;
    }

    int division = zaehler / nenner;
  }

  public static void lassUnsFangen() {
    try {
      divisionBerechnen(100);
    } catch (ArithmeticException e) { // Fangen
      System.out.println("Uh oh, falsche Mathe");
      System.out.println(e);
    }
  }

  public static void lassUnsWerfen() {
    try {
      divisionBerechnen(100);
    } catch (ArithmeticException e) { // Fangen und weiter werfen
      throw e;
    }
  }

  public static void main(String[] args) {
    try {
      lassUnsWerfen();
      // Probiere auch mit
      //lassUnsFangen();
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
  }
}
