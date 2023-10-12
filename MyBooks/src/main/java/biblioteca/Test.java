package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		// a. b. c.
		Publicacion lib0 = new Libro("Cien años de soledad","Gabriel García Márquez",735,3,false,20.99);
		Publicacion lib1 = new Libro("El señor de los anillos","J. R. R. Tolien",429,5,false,22.99);
		Publicacion lib2 = new Libro("1984","George Orwell",122,9,false,40.99);
		Publicacion lib3 = new Libro("Un mundo feliz","Aldous Huxley",270,1,false,25.99);
		Publicacion lib4 = new Libro("Orgullo y prejuicio","Jane Austen",345,2,true,12.99);
		Publicacion lib5 = new Libro("Crimen y castigo","Fiódor Dostoyevski",259,3,false,60.99);
		Publicacion lib6 = new Libro("Lolita","Vladimir Nabokov",300,5,false,27.99);
		Publicacion lib7 = new Libro("Ulises","Jamse Joyce",400,4,false,42.99);
		Publicacion lib8 = new Libro("Madame Bovary","Gustave Flaubert",723,9,true,9.99);
		Publicacion lib9 = new Libro("En busca del tiempo perdido","Marcel Proust",374,2,true,9.99);
		
		Publicacion rev0 = new Revista("Lorem Ipsum",80,1,true,9.99);
		Publicacion rev1 = new Revista("Marca",40,1,true,5.99);
		Publicacion rev2 = new Revista("Hola!",55,1,false,5.99);
		Publicacion rev3 = new Revista("Me Lo Invento",99,1,true,10.99);
		Publicacion rev4 = new Revista("PepePepe",43,1,true,2.99);

		Publicacion[] publicaciones = {lib0,lib1,lib2,lib3,lib4,lib5,lib6,lib7,lib8,lib9,rev0,rev1,rev2,rev3,rev4};
		
		// d. a.
		System.out.println("a.");
		for (Publicacion elem : publicaciones) {
			System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// d. b.
		System.out.println("b");
		for (Publicacion elem : publicaciones) {
			if (elem instanceof Libro) 
				System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// d. c.
		System.out.println("c");
		for (Publicacion elem : publicaciones) {
			if (elem instanceof Revista) 
				System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// d. d.
		System.out.println("d");
		for (Publicacion elem : publicaciones) {
			if (elem.getPrecio() > 20) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// d. e.
		System.out.println("e");
		for (Publicacion elem : publicaciones) {
			if (elem instanceof Libro && elem.getPrecio() > 20) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// d. f.
		System.out.println("f");
		for (Publicacion elem : publicaciones) {
			if (elem instanceof Revista && elem.getPrecio() > 3) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// e.
		List<Publicacion> arrayListPublicaciones = new ArrayList<Publicacion>() {
			{
				add(lib0);
				add(lib1);
				add(lib2);
				add(lib3);
				add(lib4);
				add(lib5);
				add(lib6);
				add(lib7);
				add(lib8);
				add(lib9);
				add(rev0);
				add(rev1);
				add(rev2);
				add(rev3);
				add(rev4);
			}
		};
		
		// e. a.
		System.out.println("a.");
		for (Publicacion elem : arrayListPublicaciones) {
			System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// e. b.
		System.out.println("b");
		for (Publicacion elem : arrayListPublicaciones) {
			if (elem instanceof Libro) 
				System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// e. c.
		System.out.println("c");
		for (Publicacion elem : arrayListPublicaciones) {
			if (elem instanceof Revista) 
				System.out.printf("Titulo: %s | ID: %d%n",elem.getTitulo(),elem.getID());
		}
		
		// e. d.
		System.out.println("d");
		for (Publicacion elem : arrayListPublicaciones) {
			if (elem.getPrecio() > 20) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// e. e.
		System.out.println("e");
		for (Publicacion elem : arrayListPublicaciones) {
			if (elem instanceof Libro && elem.getPrecio() > 20) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// e. f.
		System.out.println("f");
		for (Publicacion elem : arrayListPublicaciones) {
			if (elem instanceof Revista && elem.getPrecio() > 3) 
				System.out.printf("Titulo: %s | ID: %d | Precio: %f%n",elem.getTitulo(),elem.getID(),elem.getPrecio());
		}
		
		// f. 
		for(Publicacion elem : publicaciones) {
			if (elem.getTitulo() == "Ulises") {
				elem.show();
				for (int i = 0 ; i < 300 ; i++) {
					Publicacion.leePaginaStatic(elem, true);
				}
				elem.show();
				for (int i = 0 ; i < 5 ; i++) {
					Publicacion.leePaginaStatic(elem, false);
				}
				elem.show();
				for (int i = 0 ; i < 5 ; i++) {
					elem.leePagina(false);
				}
				elem.show();
				for (int i = 0 ; i < 1000 ; i++) {
					elem.leePagina(true);
				}
				elem.show();
			}
		}
	}
}
