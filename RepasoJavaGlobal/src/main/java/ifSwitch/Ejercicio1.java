package ifSwitch;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numerito = 1;
		if (numerito == 1) {
			System.out.println("Enero");
		} else if (numerito == 2) {
			System.out.println("Febrero");
		} else if (numerito == 3) {
			System.out.println("Marzo");
		} else if (numerito == 4) {
			System.out.println("Abril");
		} else if (numerito == 5) {
			System.out.println("Mayo");
		} else if (numerito == 6) {
			System.out.println("Junio");
		} else if (numerito == 7) {
			System.out.println("Julio");
		} else if (numerito == 8) {
			System.out.println("Agosto");
		} else if (numerito == 9) {
			System.out.println("Septiembre");
		} else if (numerito == 10) {
			System.out.println("Octubre");
		} else if (numerito == 11) {
			System.out.println("Noviembre");
		} else if (numerito == 12) {
			System.out.println("Diciembre");
		} else {
			System.out.println("No entiendo");
		}
		
		switch (numerito) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4: 
				System.out.println("Abril");
				break;
			case 5: 
				System.out.println("Mayo");
				break;
			case 6: 
				System.out.println("Junio");
				break;
			case 7: 
				System.out.println("Julio");
				break;
			case 8: 
				System.out.println("Agosto");
				break;
			case 9: 
				System.out.println("Septiembre");
				break;
			case 10: 
				System.out.println("Octubre");
				break;
			case 11: 
				System.out.println("Noviembre");
				break;
			case 12: 
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("No entiendo");
		}
	}
}
