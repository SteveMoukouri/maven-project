/**
 * Info about this package doing something for package-info.java file.
 */
package com.example;
/**
 * Un objet qui sert à saluer.
 */
public class Greeter {
  /**
 * Constructeur.
 */
  public Greeter() {
  }
  /**
 * Affiche un message de salutation.
 * @param someone individu 
 * @return une chaîne formatee
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
