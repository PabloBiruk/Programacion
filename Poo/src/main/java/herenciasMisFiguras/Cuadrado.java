package herenciasMisFiguras;

public class Cuadrado extends Figura{
	// Atributos
	private int lado;

	// Constructores
	private Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}
	public Cuadrado(double area) {
		this("Blanco",(int)(area / 2));
	}
	public Cuadrado(int lado) {
		this("Blanco",lado);
	}	
	
	// Getters y Setters
	public int getLado() {
		return lado;
	}
	
	// Metodos
	public double calculaPerimetro() {
		return 4*lado;
	}
	public double calculaArea() {
		return lado*lado;
	}
	public String toString() {
		return "Cuadrado [lado=" + lado + ", area=" + calculaArea()+", perimetro=" + calculaPerimetro() + "]";
	}
}
