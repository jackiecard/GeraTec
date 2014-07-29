package Conta;

import java.util.ArrayList;

public class Agencia {
	
	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void addConta(Conta c){
		contas.add(c);
	}
	
	public void removeConta(int index){
		contas.remove(index);
	}
	
	public void removeConta(Conta c){
		contas.remove(c);
	}
	
	public Conta buscaId(int id){
		for (Conta conta : contas) {
			if(conta.getId() == id){
				return conta;
			}
		}
		return null;
	}
	
	public void removeId(int id){
		for (Conta conta : contas) {
			if(conta.getId() == id){
				contas.remove(conta);
			}
		}
	}
	
	public Conta buscaCliente(String nome){
		for (Conta conta : contas) {
			if(conta.getDono() == nome){
				return conta;
			}
		}
		return null;
	}
	
	public void taxaAdm(){
		for (Conta conta : contas) {
			conta.debita(10);
		}
	}
	
	public String toString(Conta c){
		String srt = "";
		srt += "Cliente: " + c.getDono() + "\n";
		srt += "ID: " + c.getId() + "\n";
		srt += "Limite: " + c.getLimite() + "\n";
		srt += "Saldo: " + c.getSaldo() + "\n";
		return srt;
	}

}
