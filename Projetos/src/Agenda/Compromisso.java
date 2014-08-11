package Agenda;

public class Compromisso {
	
	private String inicio;
	private String titulo;
	private String descricao;
	
	public Compromisso(String i, String t, String d){
		setDescricao(d);
		setInicio(i);
		setTitulo(t);
	}

	public String toString(){
		return "Data: " + getInicio() + " - Titulo: " + getTitulo() + "\n" + getDescricao();
	}
	
	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		Data d = new Data();
		d.converteData(inicio);
		this.inicio = d.getDataString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	

}
