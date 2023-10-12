package operadoresLogicos;

public class EjercicioKB1 {
	public static void main(String[] args) {
		int edad = 14;
		String nombre = "Juan";
		boolean varon = true;
		
		System.out.printf("%s tiene %d años y por lo tanto es %s",
				nombre,edad, edad < 18 ? "menor de edad" : edad < 65 ? "mayor de edad" : varon ? "jubilado" : "jubilada");
	}
}
