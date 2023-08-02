package bancoCompleto;

public class contaCorrente extends Conta {
	
	private double saldoInvestimento;
	
	public contaCorrente(Cliente cliente, long numeroConta) {
		super(cliente, numeroConta);
	}
	
	
	public void investir(Produto produto, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
			
		}
	}
	
	public void regastar(double valor) throws SaldoInsuficiente {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		} else {
			throw new SaldoInsuficiente("Saldo de investimento insuficiente");
		}
	}
	
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
	}

}
