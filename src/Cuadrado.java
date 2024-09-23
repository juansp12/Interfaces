
public class Cuadrado implements FigurasGeometricas {
	private String nombre;
	private double lado;
	public Cuadrado (String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return(getLado() * getLado());
	}//calcularArea
	
	public double calcularPerimetro() {
		return(getLado() * 4);
	}//calcularPerimetro
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//toString
	
	
	
}//class Cuadrado
