package tiposPrimitivos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		System.out.println(5+2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(7+9/5%2-1+6*8);
		
		int b = 7;
		int c = b++;
		c = ++b;
		
		b = b++;
		System.out.println(b);
		b = ++b;
		System.out.println(b);
		
	}
}
