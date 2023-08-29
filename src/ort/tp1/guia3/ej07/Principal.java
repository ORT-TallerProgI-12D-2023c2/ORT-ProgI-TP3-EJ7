package ort.tp1.guia3.ej07;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		Figura r = new Rectangulo();
		Figura c = new Circunferencia();
		Figura te = new TrianguloEquilatero();
		
		System.out.println(r.calcularArea());
		System.out.println(c.calcularArea());
		System.out.println(te.calcularArea());
	}

}