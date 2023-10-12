package biblioteca;

public abstract class Publicacion implements CanRead{
	
	// Atributos de clase
	private String titulo, autor;
	private int numPags, pagInicial, pagActual;
	private boolean formatoDigital, leido;
	private double precio;
	private long ID;
	private static long nextID;

	// Constructores
	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		pagActual = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		nextID++;
		ID = nextID;
	}
	public Publicacion(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		pagActual = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		nextID++;
		ID = nextID;
	}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}
	public long getID() {
		return ID;
	}
	public double getPrecio() {
		return precio;
	}

	// Metodos
	@Override
	public String toString() {
		return "Publicacion \"" + titulo + "\" con " + numPags + "páginas y precio de " + precio + "€";
	}
	
	public void leePagina(boolean silenciosamente) {
		if (silenciosamente == true) {
			if (pagActual!= numPags && (pagActual+1) == numPags) {
				leido = true;
				pagActual++;
			} else {
				pagActual++;
			}	
		} else {
			if (this instanceof Libro) {
				if (pagActual == numPags) {
					System.out.printf("Libro titulado %s del autor %s ya ha sido leído%n",titulo,autor);
				} else if (pagActual!= numPags && (pagActual+1) == numPags) {
					leido = true;
					pagActual ++;
					System.out.printf("Última página (%n) leída del libro titulado %s del autor %s%n",pagActual,titulo,autor);
				} else {
					System.out.printf("Página %n leída del libro titulado %s del autor %s%n",pagActual,titulo,autor);
					pagActual++;
				}	
			} else {
				if (pagActual == numPags) {
					System.out.printf("Revista titulada %s ya ha sido leída%n",titulo);
				} else if (pagActual!= numPags && (pagActual+1) == numPags) {
					leido = true;
					pagActual++;
					System.out.printf("Última página (%n) leída de la revista titulada %s%n",pagActual,titulo);
				} else {
					System.out.printf("Página %n leída del libro titulado %s%n",pagActual,titulo);
					pagActual++;
				}
			}
		}
	}
	public static void leePaginaStatic(Publicacion p, boolean silenciosamente) {
		p.leePagina(silenciosamente);
	}
	
	public void show() {
		if (this instanceof Libro) {
			System.out.printf("%sTítulo: %s%nAutor: %s%nId: %d%nPáginas: %d%nPágina inicial: %d%n Página actual: %d%nPrecio: %f%nFormato digital: %s%nLeído: %s%n",Libro.getMensajeCabecera(),titulo,autor,ID,numPags,pagInicial,pagActual,precio,formatoDigital,leido);
		} else {
			System.out.printf("%sTítulo: %s%nId: %d%nPáginas: %d%nPágina inicial: %d%n Página actual: %d%nPrecio: %f%nFormato digital: %s%nLeído: %s%n",Revista.getMensajeCabecera(),titulo,ID,numPags,pagInicial,pagActual,precio,formatoDigital,leido);
		}
	}
	public static void showStatic(Publicacion p) {
		p.show();
	}
}
