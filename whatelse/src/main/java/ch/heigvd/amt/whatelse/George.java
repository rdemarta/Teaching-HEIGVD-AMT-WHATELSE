package ch.heigvd.amt.whatelse;

import ch.heigvd.amt.whatelse.api.ICoffee;
import ch.heigvd.amt.whatelse.impl.Yverdoto;
import sun.reflect.ReflectionFactory;

import java.lang.reflect.InvocationTargetException;

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
    String prefix = "ch.heigvd.amt.whatelse.impl.";
    String className = prefix + coffeeName;

    try {
      return (ICoffee) Class.forName(className).getConstructor().newInstance();
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return new Yverdoto();
  }

}
