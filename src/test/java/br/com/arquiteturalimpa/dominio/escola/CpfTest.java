package br.com.arquiteturalimpa.dominio.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

class CpfTest {

	@Test
	void naoDeveriaCriarCpfInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
		
		assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
		
		assertThrows(IllegalArgumentException.class, () -> new Cpf("430.050.444 -900"));
	}
	
	@Test
	void deveriaCriarCpf() {
		String validador = "412.036.555-60";
		
		Cpf cpf = new Cpf(validador);
		
		assertEquals(validador, cpf.getCpf());
		
	}
	

}
