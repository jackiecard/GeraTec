package Imovel;

public class Main {

	public static void main(String[] args) {
		Novo n = new Novo("Rua bla", 120000, 20000);
		Velho v = new Velho("Rua velha", 150000, 15000);
		System.out.println(n.tosString());
		System.out.println(v.toString());
	}

}
