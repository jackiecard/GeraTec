package EntradaDeCinema;

public class Data {
	
	private String data;
	private int dia;
	private int mes;
	private int ano;
	
	public Data(String d){
		setData(d);
		setDia();
		setMes();
		setAno();
	}
	
	public double pegaIdade(String atual){
		int diaA = pegaDia(atual);
		int mesA = pegaMes(atual);
		int anoA = pegaAno(atual);
		int numdias = 0;
		if(mesA == 2){
			numdias = 28;
		}
		if(mesA == 4 || mesA == 6 || mesA == 9 || mesA == 11){
			numdias = 30;
		}
		else{
			numdias = 31;
		}
		int dataAtualEmDias = diaA + (mesA * numdias) + (anoA * 365);
		int emDias = getDia() + (getMes() * numdias) + (getAno() * 365);
		int idade = dataAtualEmDias - emDias;
		return (double)idade/365;
	}
	
	public int pegaDia(String d){
		int barra = d.indexOf('/');
		String srt = d.substring(0,barra);
		return Integer.parseInt(srt);
	}
	
	public int pegaMes(String d){
		int barra = d.indexOf('/');
		int barraFinal = d.lastIndexOf('/');
		String srt = d.substring(barra+1,barraFinal);
		return Integer.parseInt(srt);
	}
	
	public int pegaAno(String d){
		int barra = d.lastIndexOf('/');
		String srt = d.substring(barra+1,d.length());
		return Integer.parseInt(srt);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getDia() {
		return dia;
	}

	public void setDia() {
		this.dia = pegaDia(getData());
	}

	public int getMes() {
		return mes;
	}

	public void setMes() {
		this.mes = pegaMes(getData());
	}

	public int getAno() {
		return ano;
	}

	public void setAno() {
		this.ano = pegaAno(getData());
	}
	
	
	
}
