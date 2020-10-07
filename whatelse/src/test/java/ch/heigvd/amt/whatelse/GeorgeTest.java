package ch.heigvd.amt.whatelse;

import ch.heigvd.amt.whatelse.api.ICoffee;
import ch.heigvd.amt.whatelse.impl.Chillin;
import ch.heigvd.amt.whatelse.impl.Yverdoto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeorgeTest {

  private static George george = new George();

  @Test
  void iCanGetaNiceYverdoto() {
    ICoffee coffee = george.pleasePrepareMeANice("Yverdoto");
    assertNotNull(coffee);
    assertEquals(Yverdoto.TASTE, coffee.taste());
  }

  @Test
  void iCanGetaNiceChillin() {
    ICoffee coffee = george.pleasePrepareMeANice("Chillin");
    assertNotNull(coffee);
    assertEquals(Chillin.TASTE, coffee.taste());
  }

}