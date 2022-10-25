package br.com.arquiteturalimpa.escola.academico.aplicacao.indicacao;


import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);
}
