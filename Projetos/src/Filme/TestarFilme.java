package Filme;

public class TestarFilme {

	public static void main(String[] args) {
		Filme umFilmeQualquer = new Filme("Vingadores", 142);
		umFilmeQualquer.exibirDuracaoEmHoras();
		Filme meuFilmeFavorito = new Filme("Exterminador do Futuro", 100);
		meuFilmeFavorito.setDuracao(108);
		meuFilmeFavorito.exibirDuracaoEmHoras();
		System.out.println("O filmes registrados no catálogo são " + umFilmeQualquer.getTitulo() + " e " + meuFilmeFavorito.getTitulo() + ".");
	}

}
