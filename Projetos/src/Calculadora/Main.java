package Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora('+',10,2);
		c.calcula();
		c.mostreOperacao();
		c = new Calculadora('/',10,0);
		c.calcula();
		c.mostreOperacao();
		c = new Calculadora('-',10,50);
		c.mostreOperacao();
		
	}

}
