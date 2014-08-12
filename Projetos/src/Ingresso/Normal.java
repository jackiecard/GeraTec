package Ingresso;

public class Normal extends Ingresso{

	public Normal(double v) {
		super(v);
		toString();
	}
	
	public String toString(){
		return "Ingresso Normal\nValor: R$" + super.getValorIngresso() + "\n";
	}

}
