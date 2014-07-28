package Conta;

public class GerenteDeConta {
	
	private static Conta c;
	
	public GerenteDeConta(){
	}
	
	public static boolean usaLimite(Conta conta){
		c = conta;
		if(c.getSaldo() < 0 &&  c.getSaldo() >= (-c.getLimite())){
			return true;
		}
		return false;
	}
	
	public static boolean proximoLimite(Conta conta){
		c = conta;
		double dezPc = c.getLimite() * 0.9;
		if(usaLimite(c)){
			if(c.getSaldo() <= (-dezPc)){
				return true;
			}
		}
		return false;
	}
	
	public static void somaSaldos(Conta ...contas){
		int soma = 0;
		for (Conta conta : contas) {
			soma += conta.getSaldo();
		}
		System.out.println("Saldo das contas: " + soma);
	}
	
	public static void mostraContas(Conta ...contas){
		for (Conta conta : contas) {
			System.out.println("--- CONTA " + conta.getId() + " ---");
			System.out.println("Cliente: " + conta.getDono());
			System.out.println("Saldo: " + conta.getSaldo());
			System.out.println("Limite: " + conta.getLimite());
			System.out.println("Usa o limite: " + usaLimite(conta));
			System.out.println("Próximo de estourar: " + proximoLimite(conta));
			System.out.println("");
		}
	}
	
	public static void verificarSaldo(Conta conta){
		c = conta;
		System.out.println("Saldo da conta " + c.getId() + ": " + c.getSaldo());
	}
	
}
