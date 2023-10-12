package herenciasMisFiguras;

public class Piso implements Superficiable{
	private double area;
	
	public Piso(double area) {
		this.area = area;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return area;
	}
	
}
