package Ingresso;

public class Camarote  extends Vip{

	private String localizacao;
	
	public Camarote(double v, double a, String l) {
		super(v, a);
		setLocalizacao(l);
	}
	
	public String toString(){
		return "Ingresso Camarote\n" + super.toString() + "\nLocaliza��o: " + getLocalizacao() + "\n";
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	

}
