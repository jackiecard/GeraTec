package Imovel;

public class Novo extends Imovel{

	private double adicional;
	
	public Novo(String end, double p, double ad) {
		super(end, p);
		setAdicional(ad);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public String tosString(){
		return "----- IM�VEL -----\n" + super.toString() 
				+ "\nValor adicional: R$" + getAdicional() 
				+ "\nValor do im�vel com adicional: R$"
				+ getPreco();
	}

	@Override
	public double getPreco() {
		return super.getPreco() + getAdicional();
	}	
	
}
