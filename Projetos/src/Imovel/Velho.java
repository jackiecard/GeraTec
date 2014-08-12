package Imovel;

public class Velho extends Imovel{

	private double desconto;
	
	public Velho(String end, double p, double d) {
		super(end, p);
		setDesconto(d);
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public double getPreco() {
		return super.getPreco() - getDesconto();
	}
	
	public String toString(){
		return "----- IM�VEL -----\n" + super.toString() +
				"Desconto: R$" + getDesconto() + "\nValor do im�vel com o desconto: R$" 
				+ getPreco();
	}
}
