package com.example;


public class Greeter {

  /**
 * Constructeur.
 */
  public Greeter() {
  }
  
  /**
 * Affiche un message de salutation.
 * @param someone  individu 
 * @return une chaîne formatee
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
