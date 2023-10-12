package herenciasMisFiguras;

public abstract class Figura implements Superficiable{
	// Atributos
	private String color;
	
	// Constructor
	public Figura(String color) {
		this.color = color;
	}
	
	// Getters y Setters
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	// Metodos
	public abstract double calculaPerimetro();
	public boolean comparaAreas(Figura f) {
		return f.getClass() == this.getClass() && f.calculaArea() == this.calculaArea();
	}

}
