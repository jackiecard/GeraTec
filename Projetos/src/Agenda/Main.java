package Agenda;

public class Main {

	public static void main(String[] args) {
		Compromisso c1 = new Compromisso("01/01/2014", "Ano novo", "Feliz ano novo!");
		Compromisso c2 = new Compromisso("02/01/2014", "Dia 2", "Ressaca!");
		Agenda ag = new Agenda();
		ag.addCompromisso(c1);
		ag.addCompromisso(c2);
		System.out.println(ag.mostraCompromissos("01"));
	}

}
