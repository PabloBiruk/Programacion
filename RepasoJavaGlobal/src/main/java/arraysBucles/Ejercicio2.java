package arraysBucles;

public class Ejercicio2 {
	public static void main(String[] args) {
		// a) Entre 50 y 2500 hay XX números múltiplos de 13.
		
		/**
		int numInicio = 50;
		int numFinal = 2500;
		int multiploDe = 13;
		int primerMultiplo = 0;
		
		int salidaA = 0;
		
		while (primerMultiplo = 0) {
			if (numInicio % 13 == 0) {
				primerMultiplo = numInicio;
			}
			numInicio++;
		}
		
		for (int i = primerMultiplo ; i = numFinal ; i += multiploDe) salidaA ++;
		*/
		
		// b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: XX XX ... XX
		// c) El producto de los números impares entre 10 y 20 es XX.
		// d) La suma de los números entre 70 y 800 es XXX.

		// f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
		
		// g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
		// h) El abecedario inglés de letras minúsculas es: abcdefghijklmnopqrstuvwxyz
		// i) El abecedario inglés de letras mayúsculas es: ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// j) El abecedario inglés de letras minúsculas de 3 en 3 letras es: adgjmpsvy
		
		System.out.print("j) El abecedario inglés de letras minúsculas de 3 en 3 letras es: ");
		
		for (char c = 'a' ; c <= 'z' ; c += 3) {
			System.out.print(c);
		}
		
		System.out.println();
		
		// k) El abecedario inglés de letras minúsculas alrevés es: yxwvutsrqponmlkjihgfedcba
		
		System.out.println("k) El abecedario inglés de letras minúsculas");
		
		// l) El abecedario inglés alternando mayúsculas y minúsculas es: AbCdEfGhIjKlMnOpQrStUvWxYz
		
		System.out.print("l) El abecedario inglés alternando mayúsculas y minúsculas es: ");
		
		int contador = 0;
		for (char c = 'a' ; c <= 'z' ; c++) {
			if (contador % 2 == 0){
				System.out.print(Character.toUpperCase(c));
			} else {
				System.out.print(c);
			}
			contador++;
		}
		
		System.out.println();
		
		for (char i = 'a' ; i <= 'z' ; i++) {
			System.out.print(i % 2 == 0 ? i : (char)(i-32));
		}
		
	}
}
