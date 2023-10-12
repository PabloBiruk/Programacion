package repasoPoo;

public class TestAnimal {
	public static void main(String[] args) {
		Murcielago m = new Murcielago();
		Animal a = new Animal();
		Perro p = new Perro();
		Gato g = new Gato();
		
		m.saluda();
		a.saluda();
		p.saluda();
		g.saluda();
	}
}
