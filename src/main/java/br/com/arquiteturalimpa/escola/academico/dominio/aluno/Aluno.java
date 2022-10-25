package br.com.arquiteturalimpa.escola.academico.dominio.aluno;


import java.util.ArrayList;
import java.util.List;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

public class Aluno {
		
	private String nome;
	
	private Cpf cpf;
	private Email email;

	private List<Telefone>telefones = new ArrayList<>();
	
	private String senha;
	
	public Aluno(String nome, Cpf cpf, Email email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String telefone){
		if(telefones.size() == 2) {
			throw new IllegalArgumentException("Numero maximo de telefones atingido");
		}
		this.telefones.add(new Telefone(ddd, telefone));
	}

	public String getNome() {
		return nome;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
}
