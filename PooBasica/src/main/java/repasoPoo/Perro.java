package repasoPoo;

public class Perro extends Animal{
	
	public Perro() {
		super();
	}
	
	public Perro(int peso) {
		super(peso);
	}
	
	public void saluda() {
		System.out.printf("Yo soy un perro y peso %d kilos%n",
				getPeso());
	}
}
