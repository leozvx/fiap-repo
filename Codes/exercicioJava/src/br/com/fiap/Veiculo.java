package br.com.fiap;

public class Veiculo {

	protected int velocidade = 0;
	protected int preco = 0;
	protected boolean estaLigado = false;
	
	
	public void ligar() {
		if (estaLigado == false) {
			estaLigado = true;
			System.out.println("Ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}
	
	public void desligar() {

		if (estaLigado == true) {
			estaLigado = false;
			System.out.println("Desligado.");
		} else {
			System.out.println("O carro já está desligado.");
		}
		
	}
	
	public void acelerar() {
		 
	
		
	}
	
	public void freiar() {

	}
	
}
