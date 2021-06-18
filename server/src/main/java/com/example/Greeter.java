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
/** 
*Methode qui renvoit "Hello babacar"
*@param somene une personne
*@return String une phrase
*
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
