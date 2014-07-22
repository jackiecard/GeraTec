package Calculadora;

public class Calculadora {

	private double resultado;
	private double a;
	private double b;
	private char operacao;
	private boolean zero = false;
	
	public Calculadora(char oper, double a, double b){
		setOperacao(oper);
		setA(a);
		setB(b);
	}
	
	public void calcula(){
		if(getOperacao() == '+')
			setResultado(getA() + getB());
		else if(getOperacao() == '-')
			setResultado(getA() - getB());
		else if(getOperacao() == '*')
			setResultado(getA() * getB());
		else if(getOperacao() == '/'){
			if(getB() == 0)
				zero = true;
			else
				setResultado(getA() / getB());
		}
	}
	
	public void mostreOperacao(){
		if(zero)
		System.out.println("Não existe divisão por zero!");
		else
		System.out.println("A operação " + getA() + " " + getOperacao() + " " + getB() + " é igual a " + getResultado());
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public char getOperacao() {
		return operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
	
}
