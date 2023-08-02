package bancoCompleto;

public class FundosInvestimento implements Produto {

	@Override
	public double investir(double valor) {
		
		return valor * 1.05;
	}

	
	
}
