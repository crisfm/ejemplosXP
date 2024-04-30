
package app.geometria;

import app.contratos.*;
import java.io.*; 

/**
Esta clase representa a una figura geometria. Nos permite
ilustrar herencia, polimorfismo y otros aspectos de la POO
*/
public abstract class Poligono implements Representable,Serializable{

  /** propiedad para almacenar la longitud de un lado.
  Se asumen todos los lados iguales.*/
  private double longLado;

  /** Construye un Poligono a partir de la longitud de su lado,
  se asumen pol�gonos regulares */
  public Poligono(double l){
     this.longLado = l; 
  }

  /** M�todo accesor para la propiedad que reperesenta 
  la longitud del lado */
  public double getLongLado(){
     return this.longLado;
  }


  /** Calcula el �rea de un Poligono */
  public abstract double getArea();
  
  /** Calcula el Per�metro de un Pol�gono */
  public abstract double getPerimetro();

  /** sobrescritura del metodo toString para devolver
  las caracter�sticas del objeto */
  public String toString(){
	 return "Pol�gono regular de longitud: " + this.longLado;
  }
}