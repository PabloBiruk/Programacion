package repasoPoo;

public class Animal {
	private int peso;
	
	public Animal() {
		peso = 0;
	}
	
	public Animal(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void saluda() {
		System.out.printf("Yo soy un animal y peso %d kilos%n",
				getPeso());
	}
}
