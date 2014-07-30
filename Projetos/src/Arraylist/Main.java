package Arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Ingrediente
		Ingrediente laranja = new Ingrediente("laranja", 3);
		Ingrediente laranja2 = new Ingrediente("laranja", 2);
		Ingrediente trigo = new Ingrediente("trigo", 1);
		Ingrediente leite = new Ingrediente("leite", 2);
		ArrayList<Ingrediente> i = new ArrayList<Ingrediente>();
		i.add(laranja);
		i.add(leite);
		i.add(trigo);
		//Receita
		Receita bolo = new Receita("Bolo");
		bolo.addIngrediente(laranja);
		bolo.addIngrediente(leite);
		bolo.addIngrediente(trigo);
		bolo.addIngrediente(laranja2);
		System.out.println(bolo.possoPreparar(i));
		System.out.println(bolo.toString());
	}

}
