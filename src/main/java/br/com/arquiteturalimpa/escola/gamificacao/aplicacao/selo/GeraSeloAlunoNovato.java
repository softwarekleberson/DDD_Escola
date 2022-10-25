package br.com.arquiteturalimpa.escola.gamificacao.aplicacao.selo;

import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.Selo;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.Evento;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.Ouvinte;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte{
	
	private final RepositorioDeSelo repositorioDeSelo;
	
	public GeraSeloAlunoNovato(RepositorioDeSelo repositorioDeSelo) {
		super();
		this.repositorioDeSelo = repositorioDeSelo;
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo() == TipoEvento.ALUNO_MATRICULADO;
	}

	@Override
	protected void reageAo(Evento evento) {
		Cpf cpfDoAluno = (Cpf) evento.informacoes().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		repositorioDeSelo.adicionar(novato);
	}

}
