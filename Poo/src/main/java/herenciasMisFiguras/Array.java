package herenciasMisFiguras;

public class Array {
	public static void main(String[] args) {
		
		// creo los arrays
		Figura[] arrayFiguras = {new Circulo(10.),new Circulo(13.), new Circulo(20.4), new Circulo(2.), new Rectangulo(40.), new Rectangulo(33.), new Rectangulo(50.), new Cuadrado(6.), new Cuadrado(10.), new Cuadrado(15.)};

		Piso[] arrayPisos = {new Piso(3.),new Piso(10.),new Piso(20.), new Piso(80), new Piso(80.)};	
		
		Superficiable[] arraySuperficiable = new Superficiable[arrayFiguras.length+arrayPisos.length];
		
		// introduzco los elementos en el nuevo arraySuperficiable

		for (int i = 0; i < arrayFiguras.length ; i++) {
			arraySuperficiable[i] = arrayFiguras[i];
		}
		for (int i = 0; i < arrayPisos.length ; i++) {
			arraySuperficiable[i+arrayFiguras.length] = arrayPisos[i];
		}
		
		// calculo el area total de todos los elementos
		double resul = 0;
		for (Superficiable elem : arraySuperficiable) {
			resul += elem.calculaArea();
		}
		System.out.println(resul);
		
		Piso p1 = new Piso(9.0);
		Piso p2 = new Piso(13.0);
		
		Superficiable[] arraySuperficiable2 = Utils.juntaSuperficiable(arrayFiguras,arrayPisos);
		
		for (Superficiable elem : arraySuperficiable2) {
			System.out.println(elem);
		}
		
	}
}
