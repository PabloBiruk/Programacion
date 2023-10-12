package repasoPoo;

public class Counter {
	
	// ATRIBUTOS
	
	private int value, maxValue;
	private String model;
	private static int id = 1000;
	
	// CONSTRUCTORES
	
	public Counter(int maxValue, String model) throws ValorNoValidoException {
		if (maxValue < 0) {
			throw new ValorNoValidoException("Numero no valido");
		} else {
			value = 0;
			this.maxValue = maxValue;
			this.model = model;
			id++;
		}
	}

	public Counter(int maxValue) throws ValorNoValidoException {
		this(maxValue,"N-COUNTER");
	}
	
	public Counter() throws ValorNoValidoException{
		this(100_000,"N-COUNTER");
	}
	
	public Counter(Counter c) {
		this.value = c.value;
		this.maxValue = c.maxValue;
		this.model = c.model;
		id++;
	}
	
	// GETTERS
	
	public int getValue() {
		return value;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public String getModel() {
		return model;
	}

	public static int getId() {
		return id;
	}

	// METODOS
	
	public void show(){
		System.out.printf("Contador: modelo (%s) y valor %d de %d %n",
				model, value, maxValue);
	}
	
	public boolean increment() {
		boolean resultado;
		value = (resultado = value < maxValue) ? value + 1 : value;
		return resultado;
	}
	
	public boolean increment(int n) {
		boolean resultado;
		value = (resultado = n < 0 || value > maxValue) ? value + n : value;
		return resultado;
	}
	
	public boolean reset() {
		boolean resultado;
		value = (resultado = value == maxValue) ? value = 0 : value;
		return resultado;
	}
	
	public static void main(String[] args) {
		try {
			Counter c2 = new Counter(10);
		} catch (ValorNoValidoException e) {
			System.out.println(e.getMessage());;
		}
		try {
			Counter c3 = new Counter(10,"NUEVO-COUNTER");
			Counter c4 = new Counter(c3);
			c3.show();
			c4.show();
		} catch (ValorNoValidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Counter c1 = new Counter();
		System.out.println(c1.increment(100001));
		c1.show();
		System.out.println(c1.reset());
	}
	
}
