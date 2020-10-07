package ch.heigvd.amt.whatelse.impl;

import ch.heigvd.amt.whatelse.api.ICoffee;

public class Chillin implements ICoffee {

  public static final String TASTE = "smooth and fruity";

  public String taste() {
    return TASTE;
  }

}
