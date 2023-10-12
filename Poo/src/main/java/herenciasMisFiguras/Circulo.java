package herenciasMisFiguras;

public class Circulo extends Figura{
	
	// Atributos
	private int radio;
	private final static double PI= 3.1416;
	
	// Constructores
	private Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	public Circulo() {
		this("blanco",1);
	}
	public Circulo(int radio) {
		this("blanco",radio);
	}
	public Circulo(double area) {
		this("blanco",(int)Math.sqrt(area/PI));
	}
	
	// Getters y Setters
	public int getRadio() {
		return radio;
	}
	public double getPI() {
		return PI;
	}
	
	// Metodos
	public double calculaPerimetro() {
		return 2 * PI * radio;
	}
	public double calculaArea() {
		return PI * radio * radio;
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", PI=" + PI + ", perimetro="
				+ calculaPerimetro() + ", area=" + calculaArea() + "]";
	}
	
	
}
