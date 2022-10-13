package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";
  private int matrikelnummer = 0;
  private String studiengang = "";

  public static final int RUECKMELDUNG_GEBUEHR = 312;

  //-------------------------------
  // Konstruktor
  // Passen Sie den Konstruktor an
  //-------------------------------
  public Student(String datenZeile) {
  }

  //-------------------------------------------
  // Methoden
  public int getMatrikelnummer() {
    return matrikelnummer;
  }

  public String getName() {
    return name;
  }

  public String getStudiengang() {
    return studiengang;
  }

  public void setMatrikelnummer(int matrikelnummer) {
    this.matrikelnummer = matrikelnummer;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudiengang(String studiengang) {
    this.studiengang = studiengang;
  }

  public String toString() {
    return "name: " + name
        + ", matrikelnummer: " + matrikelnummer +
        ", studiengang:" + studiengang;
  }
}
