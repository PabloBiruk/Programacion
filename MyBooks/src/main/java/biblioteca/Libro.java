package biblioteca;

public class Libro extends Publicacion{
	
	// Atributos de clase
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	
	// Constructor
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo,autor,numPags,pagInicial,formatoDigital,precio);
	}

	// Getter
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}
}
