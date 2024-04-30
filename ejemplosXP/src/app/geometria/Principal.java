package app.geometria;

/** Clase de prueba */
public class Principal {

	public static void main(String[] args) {
	  Poligono [] figuras = new Poligono[5];
//	  GestorGrafico gg = new GestorGrafico();

      figuras[0] = new Triangulo(9.0);
      figuras[1] = new Triangulo(19.0);
      figuras[2] = new Cuadrado(5.0);
      figuras[3] = new Triangulo(4.5);
      figuras[4] = new Cuadrado(3.0); 


	  for (int i=0;i<figuras.length ;i++ ){

         GestorGrafico.dibuja(figuras[i]);

	  }

	}
}
