package collectionsymaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Contador implements Comparable<Contador>{
	
	// Atributo
	private int valor;
	private String modelo;
	
	// Constructor
	private Contador(int valor, String modelo) {
		this.valor = valor;
		this.modelo = modelo;
	}
	
	// Metodos
	@Override
	public String toString() {
		return "Contador [valor=" + valor + ", modelo=" + modelo + "]";
	}
	@Override
	public int compareTo(Contador c) {
		return this.modelo.compareTo(c.modelo);
	}
	@Override
	public int hashCode() {
		return Objects.hash(modelo, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contador other = (Contador) obj;
		return Objects.equals(modelo, other.modelo) && valor == other.valor;
	}

	public static void main(String[] args) {
		List<Contador> arrayListContador = new ArrayList<Contador>();
		
		arrayListContador.add(new Contador(10,"marca1"));
		arrayListContador.add(new Contador(20,"marcaXD"));
		arrayListContador.add(new Contador(30,"marca89"));
		arrayListContador.add(new Contador(10,"arca100"));
		arrayListContador.add(new Contador(20,"marcaPÑA"));
		arrayListContador.add(new Contador(30,"marcaOMN"));
		arrayListContador.add(new Contador(50,"marcaPÑA"));
		arrayListContador.add(new Contador(60,"marca1"));
		arrayListContador.add(new Contador(90,"parcaOMN"));
		arrayListContador.add(new Contador(60,"marca89"));
		arrayListContador.add(new Contador(50,"carca100"));
		
		Collections.sort(arrayListContador);
		
		/*
		for (Contador contador : arrayListContador) {
			System.out.println(contador);	
		}
		*/
		
		Set<Contador> setContador = new HashSet<Contador>() {
			{
				add(new Contador(10,"marca1"));
				add(new Contador(20,"marcaXD"));
				add(new Contador(30,"marca89"));
				add(new Contador(10,"arca100"));
				add(new Contador(20,"marcaPÑA"));
				add(new Contador(30,"marcaOMN"));
				add(new Contador(50,"marcaPÑA"));
				add(new Contador(10,"marca1"));
				add(new Contador(20,"marcaXD"));
				add(new Contador(60,"marca89"));
				add(new Contador(50,"carca100"));
			}
		};
		for (Contador contador : setContador) {
			System.out.println(contador);	
		}
	}
	
	
}
