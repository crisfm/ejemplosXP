package app.geometria;

/** Esta Clase ilustra un cuadrilatero perfecto, es decir, 
regular (o sea, ni bueno ni malo)*/
public class Cuadrado extends Poligono{


	/** Constructor que construye un cuadrado a 
	partir de su lado*/
	public Cuadrado (double l){
	    super(l); // debe estar en la primera linea del metodo
	}

	/** Calcula area del cuadrado */
	public double getArea(){
	   return getLongLado() * getLongLado() ;
	}

	/** Calcula perimetro del cuadrado */
	public double getPerimetro(){
	   return getLongLado()*4;
	}
   
    /** Sobrescritura de toString(), heredado de java.lang.Object */
    public String toString(){
       return super.toString()+", concrectamente un cuadradado";
	}
    
	/** implementa la cualidad extraida de Representable */
	public void representar(){

		System.out.println(" ------- ");   
		System.out.println("|       |");   
		System.out.println("|       |");   
		System.out.println("|       |");   
		System.out.println(" ------- ");   
		System.out.println(" <-"+getLongLado()+"->");   
		System.out.println();   
		System.out.println();   
	    
	
	}

}
