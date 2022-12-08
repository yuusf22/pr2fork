package de.bht.pr2.lession06.example04;

import java.io.Serial;
import java.io.Serializable;

public class Auto implements Serializable {

  //------------------------------
  // Attribute
  @Serial
  private static final long serialVersionUID = -4410311189408169242L;
  private String besitzer = "";
  private String marke = "";
  private String farbe = "";
  private String standort = "";
  private int kmStand = 0;
  private int geschwindigkeit = 0;
  private transient Navi navi = null;

  //------------------------------
  // Konstruktor
  public Auto(String zeile) {
    String[] tokens = zeile.split(",");
    this.besitzer = tokens[0];
    this.marke = tokens[1];
    this.farbe = tokens[2];
    this.standort = tokens[3];
    this.kmStand = Integer.parseInt(tokens[4]);

    navi = new Navi("TomTom", "maennlich");
  }

  public Auto(String besitzer, String marke, String farbe, String standort, int kmStand) {
    this.besitzer = besitzer;
    this.marke = marke;
    this.farbe = farbe;
    this.standort = standort;
    this.kmStand = kmStand;

    navi = new Navi("TomTom", "maennlich");
  }

  //------------------------------
  // Methoden
  public void bremsen() {
    while (geschwindigkeit > 0) {
      geschwindigkeit--;
    }
  }

  public boolean equals(Object obj) {
    boolean returnBool = false;

    if (this == obj) {
      returnBool = true;
    } else if (obj == null) {
      returnBool = false;
    } else if (obj instanceof Auto) {
      Auto anderesAuto = (Auto) obj;

      if (marke.equals(anderesAuto.marke) &&
          farbe.equals(anderesAuto.farbe)) {
        returnBool = true;
      }
    }

    return returnBool;
  }

  public void fahren(String ziel, int entfernung) {
    System.out.println("Das Auto faehrt von " + standort + " nach " + ziel
        + " (" + entfernung + " Km entfernt).");
    standort = ziel;
    kmStand += entfernung;
  }

  public void gasGebenBis(int zielGeschwindigkeit) {
    geschwindigkeit = zielGeschwindigkeit;
  }

  public String getBesitzer() {
    return besitzer;
  }

  public int getGeschwindigkeit() {
    return geschwindigkeit;
  }

  public int getKmStand() {
    return kmStand;
  }

  public String getStandort() {
    return standort;
  }

  public Navi getNavi() {
    return navi;
  }

  public void setNavi(Navi navi) {
    this.navi = navi;
  }

  public String toString() {
    String returnString = besitzer + "," + marke + "," + farbe
        + "," + standort + "," + kmStand;
    return returnString;
  }
}