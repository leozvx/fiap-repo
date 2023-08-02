package Teste;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		
		PilhaInt pilhas = new PilhaInt();
		
		pilhas.init();
		pilhas.push(10);
		pilhas.push(12);
		pilhas.push(14);
		pilhas.push(16);
		
		if (!pilhas.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilhas.pop());
		else
			System.out.println("Pilha vazia");
		if (!pilhas.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilhas.pop());
		else
			System.out.println("Pilha vazia");
		if (!pilhas.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilhas.pop());
		else
			System.out.println("Pilha vazia");
		if (!pilhas.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilhas.pop());
		else
			System.out.println("Pilha vazia");
		if (!pilhas.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilhas.pop());
		else
			System.out.println("Pilha vazia");
		
		
	}

}
