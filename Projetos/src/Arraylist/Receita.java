package Arraylist;

import java.util.ArrayList;

public class Receita {
		
	private ArrayList<Ingrediente> ing;
	private String nome;
	
	public Receita(String nome){
		setNome(nome);
		this.ing = new ArrayList<Ingrediente>();
	}
	
	public String toString(){
		String srt = "--- LISTA DE INGREDIENTES E QUANTIDADES DISPONÍVEIS ---\n";
		ArrayList<Ingrediente> i = getIng();
		for (Ingrediente ingrediente : i) {
			srt += "-> " + ingrediente.toString() + "\n";
		}
		return srt;
	}
	
	public boolean possoPreparar(ArrayList<Ingrediente> ingredientes){
		int contNecessario = getIng().size();
		int contDisponivel = 0;
		ArrayList<Ingrediente> ing = getIng();
		for (Ingrediente ingrediente : ingredientes) {
			for (Ingrediente i : ing) {
				if(ingrediente.getNome().equalsIgnoreCase(i.getNome())){
					if(i.getQtd() == ingrediente.getQtd()){
						contDisponivel++;
					}
					else{
						return false;
					}
				}
			}
		}
		if(contNecessario == contDisponivel){
			return true;
		}
		return false;
		/*
		 * Não funca nesse exemplo
		if(ing.containsAll(ingredientes)){
			return true;
		}
		*/
	}
	
	public void addIngrediente(Ingrediente i){
		ArrayList<Ingrediente> in = getIng();
		boolean jaTem = false;
		for (Ingrediente ingrediente : in) {
			if(ingrediente.getNome() == i.getNome()){
				ingrediente.setQtd(ingrediente.getQtd() + i.getQtd());
				jaTem = true;
			}
		}
		if(!jaTem){
			ing.add(i);
		}
	}
	
	public void addIngrediente(ArrayList<Ingrediente> i){
		ing.addAll(i);
	}

	public ArrayList<Ingrediente> getIng() {
		return ing;
	}

	public void setIng(ArrayList<Ingrediente> ing) {
		this.ing = ing;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
