package br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Email;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}
	
	public Aluno criarAluno() {
		return new Aluno(nomeAluno, new Cpf(cpfAluno), new Email(emailAluno));
	}
	
}
