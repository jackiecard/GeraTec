package Agenda;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Compromisso> compromissos;
	
	public Agenda(){
		this.compromissos = new ArrayList<Compromisso>();
		System.out.println("-------------- AGENDA --------------");
	}
	
	public boolean addCompromisso(Compromisso c){
		if(getCompromissos().isEmpty()){
			compromissos.add(c);
		}
		else{
			for(int i = 0; i < compromissos.size(); i++) {
				if(compromissos.get(i).getInicio().equalsIgnoreCase(c.getInicio())){
					return false;
				}
				else{
					compromissos.add(c);
				}
			}
		}		
		return true;
	}
	
	public String mostraCompromissos(String mes){
		ArrayList<Compromisso> comps = getCompromissos();
		String mesC = "";
		String mesSrt = "";
		for (Compromisso compromisso : comps) {
			mesC = compromisso.getInicio().substring(5, 7);
			if(mesC.equalsIgnoreCase(mes)){
				mesSrt += compromisso.toString() + "\n-----------------\n";
			}
		}
		return mesSrt;
	}

	public ArrayList<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(ArrayList<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}
	
}
