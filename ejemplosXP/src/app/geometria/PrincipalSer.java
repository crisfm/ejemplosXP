package app.geometria;

import java.io.*;

/** Clase de prueba */
public class PrincipalSer{

	public static void main(String[] args) {
	  Poligono [] figuras = new Poligono[5];
//	  GestorGrafico gg = new GestorGrafico();

      figuras[0] = new Triangulo(9.0);
      figuras[1] = new Triangulo(19.0);
      figuras[2] = new Cuadrado(5.0);
      figuras[3] = new Triangulo(4.5);
      figuras[4] = new Cuadrado(3.0);


      try{
	   ObjectOutputStream oos = new ObjectOutputStream
		                (new FileOutputStream("poligonos.ser"));
	  
	    oos.writeObject(figuras);

	   oos.close();

	  }catch (Exception e){
	    System.out.println("HA OCURRIDO ALGO >>> " + e);
	  }


	}
}
