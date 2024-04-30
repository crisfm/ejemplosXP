package app.geometria;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/** Clase de prueba */
public class PrincipalDeSer{

	public static void main(String[] args) {
	 
	  Poligono [] figuras = null;


      try{
	   ObjectInputStream ois = new ObjectInputStream
		                (new FileInputStream("poligonos.ser"));
	  
	    
		figuras = (Poligono []) ois.readObject();



	   ois.close();

	  }catch (Exception e){
	    System.out.println("HA OCURRIDO ALGO >>> " + e);
	  }

   	  
	  for (int i=0;i<figuras.length ;i++ ){

         GestorGrafico.dibuja(figuras[i]);

	  }


	}
}
