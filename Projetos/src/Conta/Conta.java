package Conta;

public class Conta {
	
	private double saldo;
	private static int incremento = 0;
	private int id = 1000;
	private double limite;
	private String dono;
	
	public Conta(String n, double l){
		setDono(n);
		setLimite(l);
		setSaldo(0);
		setId();
	}
	
	public void incrementar(){
		incremento++;
	}
	
	public boolean debita(double valor){
		if((getSaldo() - valor) > (-getLimite())){
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	public void credita(double valor){
		setSaldo(getSaldo() + valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = this.id + incremento;
		incrementar();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	

}
