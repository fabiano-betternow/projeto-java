package br.sp.fdandrade.cadastro;

import java.util.Scanner;

public class SistemaDeCadastroDeFilmes {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner dados = new Scanner(System.in);
	    Scanner nomefilme = new Scanner(System.in);
	    Scanner lancamentofilme = new Scanner(System.in);
	    Scanner diretorfilme = new Scanner(System.in);
	    Scanner nascimentodiretor = new Scanner(System.in);
	    ListarInformacoesDoFilme informacoesDoFilme = new ListarInformacoesDoFilme();
	    CadastrarDadosDoFilme filme = new CadastrarDadosDoFilme();

	    String nome = "";
	    String lancamento = "";
	    String diretor = "";
	    String nascimento = "";

	    System.out.println(
	            "Inicio: Prencione nº: <1>, no 'Console' para começar o Cadastro de filmes, com Nome, Ano de Lançamento, Diretor e Data de nascimento do diretor do filme.\n");
	    int cadastro = 0;

	    System.out.print(
	            "Console: ");

	    cadastro = dados.nextInt();

	    while (cadastro
	            == 1) {

	        switch (cadastro) {

	            case 1:
	                System.out.println("Informe o 'Nome' do Filme: ");
	                nome = nomefilme.nextLine();
	                filme.setNome(nome);

	                System.out.println("Informe o 'Ano de lançamento' do filme: ");
	                lancamento = lancamentofilme.nextLine();
	                filme.setLancamento(lancamento);

	                System.out.println("Informe o 'Diretor' do filme: ");
	                diretor = diretorfilme.nextLine();
	                filme.setDiretor(diretor);

	                System.out.println("Informe a data de 'Nascimento' do diretor: ");
	                nascimento = nascimentodiretor.nextLine();
	                filme.setNascimento(nascimento);

	                System.out.println("\n Cadastrar outro filme agora? \n  1-Sim\n  0-Não\n");
	                cadastro = dados.nextInt();

	                informacoesDoFilme.adicionar(filme);
	                filme = new CadastrarDadosDoFilme();
	                break;

	            case 2:
	                break;
	                
	           
	        }
	       

	    }

	    informacoesDoFilme.informacoesDoFilme();
	}

}
