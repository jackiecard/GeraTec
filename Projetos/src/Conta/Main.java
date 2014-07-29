package Conta;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta("Jackie", 200);
		Conta b = new Conta("Bruno", 400);
		Conta d = new Conta("Lara", 1000);
		GerenteDeConta g = new GerenteDeConta();
		c.credita(200);
		b.credita(100);
		d.credita(-900);
		c.debita(300);
		g.verificarSaldo(c);
		g.somaSaldos(c,b,d);
		System.out.println();
		g.mostraContas(c,b,d);
		Agencia ag = new Agencia();
		ag.addConta(c);
		ag.addConta(b);
		ag.addConta(d);
		System.out.println(ag.toString(ag.buscaId(1001)));
		System.out.println(ag.toString(ag.buscaCliente("Jackie")));
		ag.taxaAdm();
		g.mostraContas(c,b,d);
	}

}
