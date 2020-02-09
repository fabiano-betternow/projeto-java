package br.sp.fdandrade.cadastro;

import java.util.ArrayList;
import java.util.List;

public class ListarInformacoesDoFilme {
	List<CadastrarDadosDoFilme> filmes = new ArrayList<>();

	public void adicionar(CadastrarDadosDoFilme cadastrofilme) {
		filmes.add(cadastrofilme);
	}

	public void informacoesDoFilme() {
		filmes.forEach((filme) -> {
			System.out.println("Nome do filme: " + filme.getNome());
			System.out.println("Ano de lancamento do filme: " + filme.getLancamento());
			System.out.println("Diretor do filme: " + filme.getDiretor());
			System.out.println("Data de nascimento do diretor: " + filme.getNascimento());
			System.out.println("-----------------------------");
		});
	}

}
