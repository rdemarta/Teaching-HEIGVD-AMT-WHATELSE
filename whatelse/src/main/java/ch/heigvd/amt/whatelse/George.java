package ch.heigvd.amt.whatelse;

import ch.heigvd.amt.whatelse.api.ICoffee;
import ch.heigvd.amt.whatelse.impl.Yverdoto;

public class George {

  /*
   !!!! WARNING !!!!
   The following keywords are STRICTLY FORBIDDEN in this class:
   - if
   - switch
   - case
   - what
   - else

   !!!! WARNING !!!!
   You must write all the code in THIS class to make the tests get green.
   */

  public ICoffee pleasePrepareMeANice(String coffeeName) {
    return new Yverdoto();
  }

}
