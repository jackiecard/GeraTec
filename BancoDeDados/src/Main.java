import java.util.Scanner;


public class Main {

	static Dado dado = new Dado();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu(){
		System.out.print("----- BEM VINDO AO PROGRAMA -----" +
		"\nEscolha a opção desejada:"+
		"\n1- Cadastrar pessoa"+
		"\n2 - Visualizar pessoas cadastradas" +
		"\n3 - Visualizar pessoas maiores de idade" +
		"\n4 - Visualizar pessoas com determinada primeira letra de nome"+
		"\nEscolha: ");
		int escolha = sc.nextInt();
		
		switch (escolha) {
		case 1: 
			System.out.print("Digite o nome: ");
			String nome = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			dado.addPessoa(nome, idade);
			System.out.print("Voltar ao menu? (s/n)");
			String resp = sc.next();
			resp.toLowerCase();
			if(resp.equals("s"))
				menu();
			else
				break;
		case 2: 
			System.out.println("Todas as pessoas cadastradas:");
			dado.mostraPessoas();
			System.out.print("Voltar ao menu? (s/n)");
			String resp2 = sc.next();
			resp2.toLowerCase();
			if(resp2.equals("s"))
				menu();
			else
				break;
		case 3: 
			System.out.println("Pessoas cadastradas com 18 ou mais anos:");
			dado.procuraPessoaDeMaior();
			System.out.print("Voltar ao menu? (s/n)");
			String resp3 = sc.next();
			resp3.toLowerCase();
			if(resp3.equals("s"))
				menu();
			else
				break;
		case 4: 
			System.out.print("Digite a primeira letra do nome a ser procurado: ");
			String pega = sc.next();
			char c  = pega.charAt(0);
			dado.procuraPrimeiraLetraNome(c);
			System.out.print("Voltar ao menu? (s/n)");
			String resp4 = sc.next();
			resp4.toLowerCase();
			if(resp4.equals("s"))
				menu();
			else
				break;
		default:
			break;
		}
		System.out.println("--- Fim ---");
	}
}
