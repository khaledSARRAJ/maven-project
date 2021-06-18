package com.example;

  /** 
  *Classe
  *@author
  *@versio/ /
  *@since 
  
  */
public class Greeter {

  /** 
  * Create an empty Greeter
  */
  public Greeter() {

}

/** {@inheritDoc} */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
