package herenciasMisFiguras;

public class Utils {
	
	public static Superficiable[] juntaArraySuperficiable(Superficiable[] array1, Superficiable[] array2) {
		Superficiable[] arraySalida = new Superficiable[array1.length+array2.length];
		for(int i = 0; i < array1.length ; i++) {
			arraySalida[i] = array1[i];
		}
		for(int i = 0; i < array2.length ; i++) {
			arraySalida[i+array2.length] =  array2[i];
		}
		return arraySalida;
	}
	
	public static Superficiable[] juntaSuperficiable(Superficiable[]... superficiables ) {
		// calculo tamaño del arraySalida
		int longitudArray = 0;
		for(int i = 0 ; i < superficiables.length ; i++) {
			longitudArray += superficiables[i].length;
		}
		Superficiable[] arraySalida = new Superficiable[longitudArray];
		
		// introduzco los valores de los parámetros al nuevo arraySalida
		int indiceParaVariosArrays = 0;
		for(int i = 0 ; i < superficiables.length ; i++) {
			for(int j = 0 ; j < superficiables[i].length ; j++) {
				arraySalida[indiceParaVariosArrays++] = superficiables[i][j];
			}
		}
		return arraySalida;
	}
	
}
