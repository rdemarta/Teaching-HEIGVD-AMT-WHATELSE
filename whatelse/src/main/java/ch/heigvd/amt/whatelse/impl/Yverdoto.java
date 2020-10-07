package ch.heigvd.amt.whatelse.impl;

import ch.heigvd.amt.whatelse.api.ICoffee;

public class Yverdoto implements ICoffee {

  public static String TASTE = "hum, it's sweet and tasty";

  public String taste() {
    return TASTE;
  }

}
