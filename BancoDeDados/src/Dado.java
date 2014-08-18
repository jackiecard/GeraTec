import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Dado {

	private int indice;
	private File arquivo;
	private FileWriter escritor;
	private BufferedWriter buffEscritor;
	private FileReader leitor;
	private BufferedReader buffLeitor;
	
	public Dado(){
		setIndice(1);
		arquivo = new File("res/data.dat");
		try {
			escritor = new FileWriter(arquivo, true);
			leitor = new FileReader(arquivo);
			buffEscritor = new BufferedWriter(escritor);
			buffLeitor = new BufferedReader(leitor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addPessoa(String nome, int idade){
		int cont = 1;
			try {
				while(buffLeitor.ready()){
					buffLeitor.readLine();
					cont++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		setIndice(cont);
		
		try {
			buffEscritor.write("[" + getIndice() + "]" + nome + "|" + idade);
			buffEscritor.newLine();
			buffEscritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void procuraPessoa(int indice){
		String sr = "[" + indice + "]";
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
				if(linha.contains(sr)){
					System.out.println("[" + cataIndice(linha) + "]"
				+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
				}
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void procuraPessoa(String nome){
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
				if(nome.equals(cataNome(linha))){
					System.out.println("[" + cataIndice(linha) + "]"
							+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
				}
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void procuraPessoa(double id){
		int idade = (int) id;
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
				if(idade == cataIdade(linha)){
					System.out.println("[" + cataIndice(linha) + "]"
							+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
				}
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Procura pessoas com 18 ou mais anos
	public void procuraPessoaDeMaior(){
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
				if(cataIdade(linha) >= 18){
					System.out.println("[" + cataIndice(linha) + "]"
							+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
				}
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Mostra todos os cadastrados
	public void mostraPessoas(){
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
					System.out.println("[" + cataIndice(linha) + "]"
							+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Procura pessoa com determinada primeira letra do nome
	public void procuraPrimeiraLetraNome(Character c){
		try {
			while(buffLeitor.ready()){
				String linha = buffLeitor.readLine();
				if(c == (cataNome(linha).charAt(0)) || Character.toUpperCase(c) == (cataNome(linha).charAt(0))){
					System.out.println("[" + cataIndice(linha) + "]"
							+ " Nome: " + cataNome(linha) + " - Idade: " + cataIdade(linha));
				}
			}
			buffLeitor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String cataIndice(String linha){
		String subs = linha.substring(linha.indexOf("[") + 1,linha.indexOf("]"));
		return subs;
	}
	
	public String cataNome(String linha){
		String subs = linha.substring(linha.indexOf("]") + 1,linha.indexOf("|"));
		return subs;
	}
	
	public int cataIdade(String linha){
		int subs = Integer.parseInt(linha.substring(linha.indexOf("|") + 1));
		return subs;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
}
