package Filme;

public class Filme {

	private String titulo;
	private int duracao;
	
	public Filme(String t, int d){
		setDuracao(d);
		setTitulo(t);
	}

	public void exibirDuracaoEmHoras(){
		int hora = getDuracao() / 60;
		int minutos = getDuracao() % 60;
		System.out.println("O filme " + titulo + " possui " + hora + " horas e " + minutos + " minutos de duração.");
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
