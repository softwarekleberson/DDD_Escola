package br.com.arquiteturalimpa.escola.gamificacao.infra.selo;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.Selo;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public class RepositorioDeSeloEmMemoria implements RepositorioDeSelo{

	private List<Selo> selos = new ArrayList<>();
	
	@Override
	public void adicionar(Selo selo) {
		this.selos.add(selo);
	}

	@Override
	public List<Selo> SelosDoAlunoCpf(Cpf cpf) {
		return this.selos.stream()
				.filter(s -> s.getCpfDoAluno().equals(cpf))
				.collect(Collectors.toList());
	}

	

}
