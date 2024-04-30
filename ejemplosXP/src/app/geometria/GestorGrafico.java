package app.geometria;

import app.contratos.*;

/** se encargar� de representar los objetos.
Atiende a las capacidades que proporciona la herencia y la
implementaci�n de interfaces y que nos da un comportamiento
polimorfico de los objetos */

public class GestorGrafico{

  /** metodo para pintar objetos que se puedan representar */
  
  public static void dibuja (Representable r){
	 r.representar();
  }


}
