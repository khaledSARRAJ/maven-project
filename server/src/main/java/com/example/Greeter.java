/**.
*package-info.java
*/
package com.example;

  /**  Classe greeter.
  *@author  khaled
  *@version 1.0
  *@since 18
  */
public class Greeter {

  /**. Create an empty Greeter*/
  public Greeter() {

}

/**{@inheritDoc}.
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
