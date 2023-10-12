package repasoPoo;

public class Murcielago extends Animal{
	
	public Murcielago() {
		super();
	}
	
	public Murcielago(int peso) {
		super(peso);
	}
	
	public void saluda() {
		System.out.printf("Yo soy un murcielago y peso %d kilos%n",
				getPeso());
	}
}
