package collectionsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Test {
	
	public static String[] devuelvePalabras(String texto) {
		return texto.replace('.',' ').replace(',',' ').replace('\n', ' ').replaceAll(" +", " ").split(" ");
	}
	
	public static void arrayPalabras(String[] arrayEntrada) {
		System.out.println("Array de palabras\n"
				+ "=================");
		for (String elem : arrayEntrada) System.out.printf("[%s]",elem);
		System.out.printf("%nLista original tiene %d palabras",arrayEntrada.length);
	}
	
	public static void arrayListPalabas(String[] arrayEntrada) {
		System.out.println("ArrayList de palabras\n"
				+ "=================");
		List<String> arrayListSalida = new ArrayList<String>();
		for (String elem : arrayEntrada) arrayListSalida.add(elem);
		for (String elem : arrayListSalida) System.out.printf("[%s]",elem);
		System.out.printf("%nLista original tiene %d palabras",arrayEntrada.length);
	}
	
	public static void hashSetPalabras(String[] arrayEntrada) {
		System.out.println("HashSet de palabras\n"
				+ "=================");
		HashSet<String> hashSetSalida = new HashSet<String>();
		for (String elem : arrayEntrada) hashSetSalida.add(elem);
		for (String elem : hashSetSalida) System.out.printf("[%s]",elem);
		System.out.printf("%nLista original tiene %d palabras",arrayEntrada.length);
	}
	
	public static void treeSetPalabras(String[] arrayEntrada) {
		System.out.println("TreeSet de palabras\n"
				+ "=================");
		TreeSet<String> treeSetSalida = new TreeSet<String>();
		for (String elem : arrayEntrada) {
			treeSetSalida.add(elem);
		}
		for (String elem : treeSetSalida) {
			System.out.printf("[%s]",elem);
		}
		System.out.printf("%nLista original tiene %d palabras",arrayEntrada.length);
	}
	
	public static void mapConteoPalabras(String[] arrayEntrada) {
		System.out.println("Conteo de palabras\n"
				+ "=================");
		Map<String,Integer> mapSalida = new HashMap<String,Integer>();
	}
	
	
	public static void main(String[] args) {
		String cuentoLechera = CuentaCuentos.cuentoLechera();
		String[] cuentoLecheraArray = devuelvePalabras(cuentoLechera);
		arrayPalabras(cuentoLecheraArray);
		System.out.println();
		arrayListPalabas(cuentoLecheraArray);
		System.out.println();
		hashSetPalabras(cuentoLecheraArray);
		System.out.println();
		treeSetPalabras(cuentoLecheraArray);
	}
}
