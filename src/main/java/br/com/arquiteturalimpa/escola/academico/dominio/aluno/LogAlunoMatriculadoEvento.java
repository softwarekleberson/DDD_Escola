package br.com.arquiteturalimpa.escola.academico.dominio.aluno;


import java.time.format.DateTimeFormatter;

import br.com.arquiteturalimpa.escola.shared.dominio.evento.Evento;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.Ouvinte;

public class LogAlunoMatriculadoEvento extends Ouvinte {

	public void reageAo(Evento evento) {
		
		String momentoFormatado = evento.momento().
				format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm" ));
		
		System.out.println(
				String.format("Aluno com CPF %s matriculado em  : %s", 
						((AlunoMatriculadoEvento) evento).getCpf(), momentoFormatado));
		
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculadoEvento;
	}
	
}
