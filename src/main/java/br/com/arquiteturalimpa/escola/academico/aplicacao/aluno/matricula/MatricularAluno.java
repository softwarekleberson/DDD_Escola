package br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.AlunoMatriculadoEvento;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.PublicadorDeEvento;

public class MatricularAluno {

	private final RepositorioDeAlunos repositoio;
	private final PublicadorDeEvento publicador;
	
	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEvento publicador) {
		this.repositoio  = repositorio;
		this.publicador = publicador;
	}
	
	
	//COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositoio.matricular(novo);
		
		AlunoMatriculadoEvento evento = new AlunoMatriculadoEvento(novo.getCpf());
		publicador.publicar(evento);
	}
	
	//COMMAND
	public void telefone(Aluno novo, String ddd, String telefone){
		novo.adicionarTelefone(ddd, telefone);
	}
}
