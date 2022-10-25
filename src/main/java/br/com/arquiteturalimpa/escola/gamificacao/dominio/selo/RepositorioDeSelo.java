package br.com.arquiteturalimpa.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public interface RepositorioDeSelo {

	void adicionar(Selo selo);
	List<Selo>SelosDoAlunoCpf(Cpf cpf);
}
