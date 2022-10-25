package br.com.arquiteturalimpa.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Aluno;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.Email;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;

class AlunoTest {

	private Aluno aluno;
	
	@BeforeEach
	void test() {
		this.aluno = new Aluno("fulano da silva",
					 new Cpf("123.456.789-00"),
					 new Email("fulano@gmail.com"));
	}
	
	@Test
	void deveriaPermitirAdicionar1Telefone()  {
		this.aluno.adicionarTelefone("11", "999999999");
		assertEquals(1, this.aluno.getTelefones().size());
	}
	
	@Test
	void deveriaPermitirAdicionar2Telefone() {
		this.aluno.adicionarTelefone("11", "123456789");
		this.aluno.adicionarTelefone("11", "987654321");
		assertEquals(2, this.aluno.getTelefones().size());
	}
	
	@Test
	void NaoDeveriaPermitirAdicionar3Telefone(){
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("11", "499999991");
			this.aluno.adicionarTelefone("11", "599999992");
			this.aluno.adicionarTelefone("11", "699999993");

		});
		
	}


}
