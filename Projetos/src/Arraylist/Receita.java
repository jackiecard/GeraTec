package Arraylist;

import java.util.ArrayList;

public class Receita {
	/*
	   public Receita(String nome)  // Construtor 
	   // Retorna uma lista com os ingredientes da receita (lista de
	   // inst�ncias da classe Ingrediente).
	   
	   public ArrayList ingredientes();
	   // Acrescenta um ingrediente � receita
	   
	   public void adicionaIngrediente(Ingrediente i);
	   // Acrescenta um conjunto de ingredientes � receita
	   public void adicionaIngredientes(ArrayList ingredientes);
	   
	   // Verifica se � poss�vel preparar a receita com um conjunto de ingredientes
	   // Retorna verdadeiro se o conjunto passado como par�metro contiver todos
	   // os ingredientes necess�rios para o preparo, em quantidade suficiente.
	   public bool possoPreparar(ArrayList ingredientes);
	   
	   // Retorna um string com todos os ingredientes, um por linha, sendo cada
	   // ingrediente no formato especificado na classe Ingrediente
	   public String toString();
	   
	   // Retorna o nome
	   public String getNome();
	   
	   // Programa main que demonstre todos os m�todos implementados
	    * */
	
	private ArrayList<Ingrediente> ing;
	private String nome;
	
	public Receita(String nome){
		setNome(nome);
		this.ing = new ArrayList<Ingrediente>();
	}
	
	public String toString(){
		String srt = "--- LISTA DE INGREDIENTES E QUANTIDADES DISPON�VEIS ---\n";
		ArrayList<Ingrediente> i = getIng();
		for (Ingrediente ingrediente : i) {
			srt += "-> " + ingrediente.toString() + "\n";
		}
		return srt;
	}
	
	public boolean possoPreparar(ArrayList<Ingrediente> ingredientes){
		int contNeces = getIng().size();
		int cont = 0;
		ArrayList<Ingrediente> ing = getIng();
		for (Ingrediente ingrediente : ingredientes) {
			for (Ingrediente i : ing) {
				if(ingrediente.getNome().equalsIgnoreCase(i.getNome())){
					if(i.getQtd() == ingrediente.getQtd()){
						cont++;
					}
					else{
						return false;
					}
				}
			}
		}
		if(contNeces == cont){
			return true;
		}
		return false;
		/*
		 * N�o funca nesse exemplo
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
