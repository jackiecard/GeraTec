package Ingresso;

public class Main {

	public static void main(String[] args) {
		Normal n = new Normal(12);
		Camarote c = new Camarote(20, 10, "Lado esquerdo");
		CamaroteInferior in = new CamaroteInferior(20, 10, "Lado direito");
		System.out.println(n);
		System.out.println(c.toString());
		System.out.println(in.toString());
	}

}
