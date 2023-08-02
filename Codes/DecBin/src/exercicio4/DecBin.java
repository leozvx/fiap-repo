package exercicio4;

import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		
		pilha.init();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ser convertido: ");
		String binaria = Integer.toBinaryString(sc.nextInt());
		System.out.println(binaria);
		
		
		
		sc.close();
	}
	
	
	
	
}
