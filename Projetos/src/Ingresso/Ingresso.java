package Ingresso;

public class Ingresso {

	private double valorIngresso;
	
	public Ingresso(double v){
		setValorIngresso(v);
	}
	
	public String toString(){
		return "Valor do ingresso: " + getValorIngresso();
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
}
