

public class Main {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("T", 87, 121, 110);
		Cuadrado c = new Cuadrado("Cuadrado", 20);
		Rectangulo r = new Rectangulo("Rectangulo", 15, 4, 20);
		Rombo rombo = new Rombo("Rombo", 4, 5, 7);
		Trapecio tr = new Trapecio("Trapecio", 15, 7, 8, 3, 9, 10);
		Romboide ri = new Romboide("Romboide", 8, 4, 5);
		imprimirCalculo(t1);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rombo);
		imprimirCalculo(tr);
		imprimirCalculo(ri);
	}//main
	
	public static void imprimirCalculo(FigurasGeometricas t) {
		System.out.println(t);
		System.out.println("+-----------------------------------------");
		System.out.println("El área de [" + t.getNombre()
				+ "] es: " + t.calcularArea());
		System.out.println("El perimetro de [" + t.getNombre()
				+ "] es: " + t.calcularPerimetro());
		System.out.println("+------------------------------------------");
	}//imprimirCalculo

}//class Main
