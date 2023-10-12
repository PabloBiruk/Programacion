package repasoPoo;

public class ValorNoValidoException extends Exception{
	public String msj;
	public ValorNoValidoException(String msj) {
		super(msj);
	}
}
