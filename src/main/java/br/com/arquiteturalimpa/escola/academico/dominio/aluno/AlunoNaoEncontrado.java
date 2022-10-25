package br.com.arquiteturalimpa.escola.academico.dominio.aluno;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public class AlunoNaoEncontrado extends RuntimeException {
	
	public AlunoNaoEncontrado(Cpf cpf) {
		super("Aluno com o cpf : " + cpf.getCpf() + "não encontrado");
	}

}
