package app.geometria;

/** Esta Clase ilustra un Triangulo perfecto, es decir, 
regular (o sea, ni bueno ni malo)*/
public class Triangulo extends Poligono{

	/** Constructor que construye un triangulo a 
	partir de su lado*/
	public Triangulo (double l){
	  super(l);
	}

	/** Calcula area del triangulo */
	public double getArea(){
	    return (getBase()*getAltura()/2);
	}

	/** Calcula perimetro del triangulo */
	public double getPerimetro(){
	    return (getLongLado() * 3);
	}
   
    /** Calcula la base de un triangulo equilatero */
	public double getBase(){
	    return getLongLado();
	}

	/** Calcula la altura (h) de un triangulo equilatero */
	public double getAltura(){
	  // altura = catetoB;
      double catetoA = getBase()/2;
	  double hipotenusa = getLongLado();
	  double catetoB = 
		  Math.sqrt( (hipotenusa*hipotenusa) - (catetoA*catetoA) );
      return catetoB;
	}
	
	/** Sobrescritura de toString(), 
	 heredado de java.lang.Object */
    public String toString(){
     return super.toString() + "(concretamene un Triangulo)";
	}

	/** implementa la cualidad extraida de Representable */
	public void representar(){
	
    System.out.println("   / \\");   
    System.out.println("  /   \\");   
    System.out.println(" /     \\");   
    System.out.println(" -------");   
    System.out.println(" <-"+getLongLado()+"->");   
    System.out.println();   
    System.out.println();   
    System.out.println();   
	
	}

	
}
