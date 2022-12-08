package de.bht.pr2.lession06.example04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Beispiel4 {

  // Bei Deserialisierung wird Konstruktor nicht aufgerufen

  private static Auto auto = null;

  private static Auto deserialize() {
    try {
      FileInputStream fis = new FileInputStream("lession06/src/main/resources/Auto.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);

      final Auto auto1 = (Auto) ois.readObject();
      ois.close();
      fis.close();
      return auto1;
    } catch (IOException | ClassNotFoundException e) { // HHH
      e.printStackTrace();
    }
    return null;
  }

  private static void serialize() {
    try {
      FileOutputStream fos = new FileOutputStream("lession06/src/main/resources/Auto.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(auto);
      oos.close();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    auto = new Auto("Anna", "VW", "gelb", "Berlin", 10000);
    System.out.println(auto.getNavi());

    serialize();
    final Auto deserializedAuto = deserialize();

    System.out.println(deserializedAuto.getNavi());
  }
}
