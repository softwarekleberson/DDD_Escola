package br.com.arquiteturalimpa.escola.academico.dominio.indicacao;


import java.time.LocalDateTime;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;

public class Indicacao {
	
	private Aluno indicado;
	private Aluno indicacao;
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicacao) {
		
		this.indicado = indicado;
		this.indicacao = indicacao;
		this.dataIndicacao = LocalDateTime.now();
	}
	
	public Aluno getIndicado() {
		return indicado;
	}
	
	public Aluno getIndicacao() {
		return indicacao;
	}
	
	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
	
}
