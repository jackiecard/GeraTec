package Arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Ingredientes
		Ingrediente laranja = new Ingrediente("laranja", 1000.0f);
		Ingrediente laranja2 = new Ingrediente("laranja", 2000.0f);
		Ingrediente trigo = new Ingrediente("trigo", 1000.0f);
		Ingrediente leite = new Ingrediente("leite", 2000);
		//Ingredientes Necess�rios
		ArrayList<Ingrediente> ingreNecessarios = new ArrayList<Ingrediente>();
		ingreNecessarios.add(laranja);
		ingreNecessarios.add(leite);
		ingreNecessarios.add(trigo);
		//Receita
		Receita bolo = new Receita("Bolo");
		//Ingredientes Dispon�veis
		bolo.addIngrediente(laranja);
		bolo.addIngrediente(leite);
		bolo.addIngrediente(trigo);
		bolo.addIngrediente(laranja2);
		bolo.addIngrediente(new Ingrediente("Chocolate", 2000));
		System.out.print("Status da receita: ");
		System.out.println(bolo.possoPreparar(ingreNecessarios) ? "os ingredientes est�o dispon�veis.\n" : "falta ingredientes.\n");
		System.out.println(bolo.toString());
	}

}
