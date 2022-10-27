package de.bht.pr2.lession02.gruppen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GruppenProgrammieren {

  @Test
  void testMathe() {
    int a = 10;
    int b = 20;
    assertEquals(170, SomeMathClass.mathe(a, b));
  }

  @Test
  void testStringAbkuerzen() {
    String s = "Mary has a little lamb";
    assertEquals("Mhall", SomeMathClass.abbreviations(s));
  }
}
