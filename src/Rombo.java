
public class Rombo implements FigurasGeometricas  {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Rombo (String nombre, double base, double altura, double lado) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return(getBase() * getAltura());
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
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", Diagonal Menor=" + base + ", Diagonal Mayor=" + altura + ", lado=" + lado + "]";
	}//toString
	
	
}//classRombo
