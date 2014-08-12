package Ingresso;

public class Vip extends Ingresso{

	private double adicional;
	
	public Vip(double v, double a) {
		super(v);
		setAdicional(a);
	}
	
	public String toString(){
		return "Valor do ingresso: " + getValorIngresso();
	}
	
	@Override
	public double getValorIngresso() {
		// TODO Auto-generated method stub
		return super.getValorIngresso() + getAdicional();
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
}
