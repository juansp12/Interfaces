
public class Trapecio implements FigurasGeometricas {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	private double lado2;
	private double lado3;
	
	public Trapecio(String nombre, double base, double altura, double lado, double lado2, double lado3, double lado4) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calcularArea() {
		return((getAltura()* (getLado2() + getBase()))/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return(getLado() + getLado2() + getLado3() + getBase());
	}//calcularPerimetro
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + ", lado2="
				+ lado2 + ", lado3=" + lado3 + "]";
	}
	
	
	
}//class Trapecio
