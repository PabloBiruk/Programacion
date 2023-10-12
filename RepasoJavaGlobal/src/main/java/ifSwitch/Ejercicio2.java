package ifSwitch;

public class Ejercicio2 {
	public static void main(String[] args) {
		String mes = "Enero";
		if (mes == "Enero") {
			System.out.println("1");
		} else if (mes == "Febrero") {
			System.out.println("2");
		} else if (mes == "Marzo") {
			System.out.println("3");
		} else if (mes == "Abril") {
			System.out.println("4");
		} else if (mes == "Mayo") {
			System.out.println("5");
		} else if (mes == "Junio") {
			System.out.println("6");
		} else if (mes == "Julio") {
			System.out.println("7");
		} else if (mes == "Agosto") {
			System.out.println("8");
		} else if (mes == "Septiembre") {
			System.out.println("9");
		} else if (mes == "Octubre") {
			System.out.println("10");
		} else if (mes == "Noviembre") {
			System.out.println("11");
		} else if (mes == "Diciembre") {
			System.out.println("12");
		} else {
			System.out.println("0");
		}
		
		switch (mes) {
			case "Enero":
				System.out.println("1");
				break;
			case "Febrero":
				System.out.println("2");
				break;
			case "Marzo":
				System.out.println("3");
				break;
			case "Abril": 
				System.out.println("4");
				break;
			case "Mayo": 
				System.out.println("5");
				break;
			case "Junio": 
				System.out.println("6");
				break;
			case "Julio": 
				System.out.println("7");
				break;
			case "Agosto": 
				System.out.println("8");
				break;
			case "Septiembre": 
				System.out.println("9");
				break;
			case "Octubre": 
				System.out.println("10");
				break;
			case "Noviembre": 
				System.out.println("11");
				break;
			case "Diciembre": 
				System.out.println("12");
				break;
			default:
				System.out.println("0");
		}
	}
}
