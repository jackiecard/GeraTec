package Livro;

public class TestaLivro {

	public static void main(String[] args) {
		Livro l = new Livro("O Pequeno Príncipe");
		l.setQtdPaginas(98);
		l.setPaginasLidas(20);
		l.verificarProgresso();
		l.setPaginasLidas(50);
		l.verificarProgresso();
	}

}
