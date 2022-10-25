package br.com.arquiteturalimpa.escola.academico.dominio.aluno;


import java.time.LocalDateTime;
import java.util.Map;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.Evento;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.TipoEvento;

public class AlunoMatriculadoEvento implements Evento {

	private final Cpf cpf;
	private final LocalDateTime momento;
	
	
	public AlunoMatriculadoEvento(Cpf cpf) {
		this.cpf = cpf;
		this.momento = LocalDateTime.now();
	}
	
	@Override
	public LocalDateTime momento() {
		return momento;
	}
	
	public Cpf getCpf() {
		return cpf;
	}
	
	public LocalDateTime getMomento() {
		return momento;
	}

	@Override
	public TipoEvento tipo() {
		return TipoEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", cpf);
	}

}
