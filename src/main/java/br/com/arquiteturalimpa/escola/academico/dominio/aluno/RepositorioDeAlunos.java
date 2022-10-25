package br.com.arquiteturalimpa.escola.academico.dominio.aluno;


import java.util.List;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarCPF(Cpf cpf);
		
	List<Aluno> listarTodosAlunosMatriculados();
}
