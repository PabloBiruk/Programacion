package generics;

public class Box <T>{
	// Propiedades
	private T contenido;
	
	// Constructores
	private Box(T contenido) {
		this.contenido = contenido;
	}
	public static <T> Box<T> of(T contenido){
		return new Box<T>(contenido);
	}
	public static <T> Box<T> empty(){
		return new Box<T>(null);
	}
	public boolean isPresent() {
		return contenido == null ? false : true;
	}
	
	// Getter
	public T getContenido() {
		return contenido;
	}
}
