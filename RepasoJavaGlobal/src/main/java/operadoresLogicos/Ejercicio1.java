package operadoresLogicos;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean W = false;
		boolean X = true;
		boolean Y = true;
		boolean Z = false;
		
		boolean b = X && !Y && !X || !W && Y;
		boolean c = !(W || !Y) && X || Z;
		boolean d = X && Y && W || Z || X;
		boolean e = Y || !(Y || Z && W);
		boolean f = !X && Y && (!Z || !X);
		
		System.out.println("b) X && !Y && !X || !W && Y => " + b);
		System.out.println("c) !(W || !Y) && X || Z => " + c);
		System.out.println("d) X && Y && W || Z || X => " + d);
		System.out.println("e) Y || !(Y || Z && W) => " + e);
		System.out.println("f) !X && Y && (!Z || !X) => " + f);
		
	}
}
