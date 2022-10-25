package br.com.arquiteturalimpa.escola.academico.infra.aluno;


import java.util.ArrayList;
import java.util.List;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.AlunoNaoEncontrado;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno>matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarCPF(Cpf cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getCpf()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
