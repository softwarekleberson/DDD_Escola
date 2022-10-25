import java.util.List;

import br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula.MatricularAluno;
import br.com.arquiteturalimpa.escola.academico.aplicacao.aluno.matricula.MatricularAlunoDto;
import br.com.arquiteturalimpa.escola.academico.dominio.aluno.LogAlunoMatriculadoEvento;
import br.com.arquiteturalimpa.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.arquiteturalimpa.escola.gamificacao.aplicacao.selo.GeraSeloAlunoNovato;
import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.RepositorioDeSelo;
import br.com.arquiteturalimpa.escola.gamificacao.dominio.selo.Selo;
import br.com.arquiteturalimpa.escola.gamificacao.infra.selo.RepositorioDeSeloEmMemoria;
import br.com.arquiteturalimpa.escola.shared.dominio.Cpf;
import br.com.arquiteturalimpa.escola.shared.dominio.evento.PublicadorDeEvento;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		
		String nome = "Fulano da silva salro";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		PublicadorDeEvento publicar = new PublicadorDeEvento();
		publicar.adicionar(new LogAlunoMatriculadoEvento());
		publicar.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSeloEmMemoria()));

		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicar);
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));

	}
}
