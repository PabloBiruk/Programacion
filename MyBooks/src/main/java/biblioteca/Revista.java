package biblioteca;

public class Revista extends Publicacion{
	
	// Atributos de clase
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";

	// Constructor
	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo,numPags,pagInicial,formatoDigital,precio);
	}
	
	// Getter
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}
}
