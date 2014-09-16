package Logica;
import java.util.Scanner;

public class Logica {

	Scanner sc = new Scanner(System.in);
	
	public Logica(){
	}
	
	public void doWhile(){
		int result = 0;
		do {
			System.out.print("15 * 2  - 30 / 3 = ");
			result = sc.nextInt();
		} 
		while ((15 * 2  - 30 / 3) != result);
		sc.close();
		System.out.println("Resposta correta: " + result);
	}
	
	public void numeroPrimo(){
		int primo = 0;
		do {
			System.out.print("Qual é o primeiro número primo depois de 100? ");
			primo = sc.nextInt();
		} while (primo != 101);
		System.out.println("Parabéns! O primeiro número primo depois de 100 é " + primo);
	}
	
	public void balanca(){
		String resposta  = "";
		System.out.print("O que é que mantém o mesmo tamanho, não importa o peso? ");
		resposta = sc.next();
		if(resposta.equalsIgnoreCase("balança")){
			System.out.println("Resposta correta!");
		}
		else{
			System.out.println("Resposta errada!");
		}
	}
	
	public void paresImpares(){
		int cont = 0;
		int repeticao = 6;
		while(repeticao > 0){
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			if(num % 2 == 0){
				cont++;
			}
			repeticao--;
		}
		System.out.println("A quantidade de número pares é " + cont 
				+ " e a quantidade de número ímpares é " + (6 - cont));
	}
	
	public void numeroSorteado(){
		int sorteado = (int)(Math.random() * 10);
		System.out.print("Digite um número (1-10): ");
		int resp = sc.nextInt();
		if(sorteado == resp){
			System.out.println("Parabéns! Você acertou!");
		}
		else{
			System.out.println("Você errou! O número sorteado foi " + sorteado);
		}
	}
	
}
