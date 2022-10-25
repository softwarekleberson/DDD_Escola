package br.com.arquiteturalimpa.dominio.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaPassarEmailInavalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));

	}
	
	@Test
	void deveriaCriarEmailGoogle() {
		String emailGoogle = "antoniosilvacond@gmail.com";	
		
		Email email = new Email(emailGoogle);
		assertEquals(emailGoogle, email.getEndereco());

	}
	
	@Test
	void deveriaCriarEmailLive() {
		String emailLive = "klebersoncond@live.com";	
		
		Email email = new Email(emailLive);
		assertEquals(emailLive, email.getEndereco());

	}
	
	
	

}
