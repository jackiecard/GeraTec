package EntradaDeCinema;

public class Main {

	public static void main(String[] args) {
		Data pessoa1 = new Data("01/08/2000");
		Data pessoa2 = new Data("22/06/2004");
		Data sessao = new Data("25/08/2014");
		EntradaDeCinema en = new EntradaDeCinema(sessao, 10.2f, 2, 12.0f);
		EntradaDeCinema en2 = new EntradaDeCinema(sessao, 20.2f, 4, 16.0f);
		en.calculaDesconto(pessoa1,11101293);
		en2.calculaDesconto(pessoa2,0);
		System.out.println(en.toString() + "\n");
		System.out.println(en2.toString());
	}

}
