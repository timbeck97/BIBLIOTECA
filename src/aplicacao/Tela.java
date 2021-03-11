package aplicacao;

import java.util.List;

import biblioteca.Livro;

public class Tela {
	
	
	public  static void imprimeAcervo(List<Livro> acervo) {
		System.out.println("--------------------");
		for(Livro livro: acervo) {
			System.out.println(livro);
		}
	}
}
