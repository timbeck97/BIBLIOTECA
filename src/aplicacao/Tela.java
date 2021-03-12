package aplicacao;

import java.util.List;

import biblioteca.Livro;

public class Tela {
	
	
	public  static void imprimeAcervo(List<Livro> acervo) {
		System.out.println("--------------------");
		System.out.println("ID   Nome do livro\n");
		for(Livro livro: acervo) {
			System.out.println(livro.getId()+"    "+livro);
		}
	}
}
