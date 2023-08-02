package bancoCompleto;

import java.util.Date;


public abstract class Conta {

	//atributos
	protected final Cliente cliente;
	protected final long numeroConta;
	protected double saldo;
	protected static long contador;
	protected Date dataAbertura;
	
	public static void exibirContador() {
		System.out.println(contador);
		
	}
	
	public Conta(Cliente cliente, long numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.dataAbertura = new Date();
		contador++;
	}
	
	
	
	public boolean sacar(double valor) throws SaldoInsuficiente {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
						return true;
			}
		}
		return false;
	}
	
	public double depositar(double valor) {
		return this.saldo = this.saldo + valor;
	}
}
