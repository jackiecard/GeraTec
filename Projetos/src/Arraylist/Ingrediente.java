package Arraylist;

public class Ingrediente { 
	
	private String nome;
	private float qtd;
	
	public Ingrediente (String nome, float qtd){
		setNome(nome);
		setQtd(qtd);
	}
	
	public String toString(){
		String srt = "";
		srt+= getNome() + "(" + getQtd() + ")";
		return srt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		this.qtd = qtd;
	}
	
	
	
	}