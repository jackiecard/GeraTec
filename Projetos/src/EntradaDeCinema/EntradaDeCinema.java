package EntradaDeCinema;

public class EntradaDeCinema {

	private Data data;
	private float horario;
	private int sala;
	private float valor;
	private float valorSemDesconto;
	private int carteirinha = 0;
	
	public EntradaDeCinema(Data d, float h, int s, float v){
		setData(d);
		setHorario(h);
		setSala(s);
		setValor(v);
		valorSemDesconto = v;
	}
		
	public String toString() {
		if(carteirinha > 0)
		return "--- TICKET CINEMA ---\nData de emissão: " + getData().getData() + "\nSessão: " + getHorario() + "\nSala: " + getSala() + 
				"\nIdentificação Estudante: " + carteirinha + 
				"\nValor do ingresso sem descontos: R$" + valorSemDesconto +"\nValor do ingresso com descontos: R$" + getValor() ;
		else
			return "--- TICKET CINEMA ---\nData de emissão: " + getData().getData() + "\nSessão: " + getHorario() + "\nSala: " + getSala() + 
					"\nValor do ingresso sem descontos: R$" + valorSemDesconto + "\nValor do ingresso com descontos: R$" + getValor();
	}



	public void calculaDesconto(Data n, int carteira){
		double idade = n.pegaIdade(getData().getData());
		if(idade < 13){
			menorQueDoze();
		}
		if(carteira > 0){
			carteirinha = carteira;
			descontoEstudante(n, carteira);
		}
		if(getHorario() < 16.0f){
			descontoHorario();
		}
	}
	
	public void descontoHorario(){
			setValor(getValor() - (getValor() * 0.2f));
	}
	
	public void descontoEstudante(Data n, int carteira){
		double idade = n.pegaIdade(getData().getData());
		if(idade > 11 && idade < 16)
			setValor(getValor() - (getValor() * 0.4f));
		else if(idade > 15 && idade < 21)
			setValor(getValor() - (getValor() * 0.3f));
		else if(idade > 20)
			setValor(getValor() - (getValor() * 0.2f));
	}
	
	public void menorQueDoze(){
		setValor(getValor() - (getValor() * 0.5f));
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public float getHorario() {
		return horario;
	}

	public void setHorario(float horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
}
