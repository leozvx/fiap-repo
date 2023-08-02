package bancoCompleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	protected String nome;
	protected String endereco;
	protected Date aniversario; // Final proibe que a classe seja herdada.
	
	public Cliente(String nome, String endereco, String aniversario) throws ParseException {
		this.nome = nome;
		this.endereco = endereco;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.aniversario = formato.parse(aniversario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	 
	
}
