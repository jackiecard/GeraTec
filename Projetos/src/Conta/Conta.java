package Conta;

public class Conta {
	
	private int saldo;
	private static int incremento = 0;
	private int id = 1000;
	private int limite;
	private String dono;
	
	public Conta(String n, int l){
		setDono(n);
		setLimite(l);
		setSaldo(0);
		setId();
	}
	
	public void incrementar(){
		incremento++;
	}
	
	public boolean debita(int valor){
		if((getSaldo() - valor) > (-getLimite())){
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	public void credita(int valor){
		setSaldo(getSaldo() + valor);
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = this.id + incremento;
		incrementar();
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	

}
