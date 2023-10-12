package repasoPoo;

public class Gato extends Animal{
	
	public Gato() {
		super();
	}
	
	public Gato(int peso) {
		super(peso);
	}
	
	public void saluda() {
		System.out.printf("Yo soy un gato y peso %d kilos%n",
				getPeso());
	}
}
