package herenciasMisFiguras;

public class Rectangulo extends Figura{
	
	// Atributos
	private int base, altura;
	
	
	// Constructores
	private Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		this("Blanco", 2, 1);
	}
	public Rectangulo(double area) {
		this("Blanco", 2 * (int) Math.sqrt(area/2),(int) Math.sqrt(area/2));
	}
	public Rectangulo(int base, int altura) {
		this("Blanco",base,altura);
	}

	// Getters y Setters
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	// Metodos
	public double calculaPerimetro() {
		return (base+altura) * 2;
	}
	public double calculaArea() {
		return base * altura;
	}
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", area=" + calculaArea() + ", perimetro=" + calculaPerimetro() + "]";
	}
	
}
