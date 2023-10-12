package generics;

public class Pareja<T, U>{
	// Propiedades
	private T p1;
	private U p2;
	
	// Constructor
	public Pareja(T p1, U p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// Getters y Setters
	public T getP1() {
		return p1;
	}
	public void setP1(T p1) {
		this.p1 = p1;
	}
	public U getP2() {
		return p2;
	}
	public void setP2(U p2) {
		this.p2 = p2;
	}
	
	public static void main(String[] args) {
		Pareja<Box<String>,String> p1 = new Pareja<Box<String>,String>(Box.of("hola"),"hola2");
		
		System.out.println(p1.getP1().getContenido());
		System.out.println(p1.getP2());
		
	}
	
}
