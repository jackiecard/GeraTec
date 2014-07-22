package Livro;

public class Livro {
	
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	public Livro(String t, int qtd, int lidas){
		setPaginasLidas(lidas);
		setQtdPaginas(qtd);
		setTitulo(t);
	}
	
	public Livro(String t){
		setTitulo(t);
	}
	
	public void verificarProgresso(){
		double porcentagem = (getPaginasLidas() * 100.0) / getQtdPaginas();
		System.out.println("Você leu " + porcentagem + "% do livro \"" + getTitulo() + "\".");
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	

}
