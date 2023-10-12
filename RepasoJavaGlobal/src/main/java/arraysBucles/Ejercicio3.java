package arraysBucles;

import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numElem = 10_000;
		int[] array = new int[numElem];
		Random r = new Random();
		
		int maximo = array[0];
		
		for (int i = 0 ; i <= array.length - 1; i++) {
			array[i] = r.nextInt(1,10_001);
		}
		
		for (int i:array) {
			if (maximo < array[i]) {
				maximo = array[i];
			}
		}
		
		int minimo = maximo;
		
		for (int i:array) {
			if (minimo > array[i]) {
				minimo = array[i];
			}
		}
		
		System.out.println("Numero mayor: " + maximo);
		System.out.println("Numero minimo: " + minimo);
		
	}
}
