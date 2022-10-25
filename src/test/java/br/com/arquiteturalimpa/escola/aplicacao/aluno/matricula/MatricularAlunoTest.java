package br.com.arquiteturalimpa.escola.aplicacao.aluno.matricula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula.MatricularAluno;
import br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula.MatricularAlunoDto;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;
import br.com.arquiteturalimpa.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@gmail.com");
		dados.criarAluno().adicionarTelefone("12", "123456789");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarCPF(new Cpf("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@gmail.com", encontrado.getEmail());
		
	}

}
