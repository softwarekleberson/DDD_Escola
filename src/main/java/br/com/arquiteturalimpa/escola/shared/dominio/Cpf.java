package br.com.arquiteturalimpa.escola.shared.dominio;


public class Cpf {
	
	private String cpf;

	public Cpf(String cpf) {
		
		if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("Cpf inv�lido");
		}
		
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return cpf;
	}
		
}
