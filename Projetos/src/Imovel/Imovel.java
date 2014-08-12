package Imovel;

public class Imovel {
	
	private String endereco;
	private double preco;
	
	public Imovel(String end, double p){
		setEndereco(end);
		setPreco(p);
	}

	public String toString(){
		return "Endereço: " + getEndereco() + "\nPreço: " + getPreco();
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
