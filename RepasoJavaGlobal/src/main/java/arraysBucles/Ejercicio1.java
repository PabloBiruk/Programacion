package arraysBucles;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numElem = 50_000;
		int multiploDe = 2;
		int inicio = 800;
		int primerMultiploDe = 0;
		int[] array = new int[numElem];

		// Buscando el primer multiplo de multiploDe 
		// empezando por inicio
		primerMultiploDe = ((inicio - 1) / multiploDe + 1) * multiploDe;
		System.out.println(primerMultiploDe);
		
		
		// Cálculo de la suma
		long suma = (primerMultiploDe + primerMultiploDe + multiploDe * numElem) / 2 * numElem;
		System.out.println(suma);
	}
}
