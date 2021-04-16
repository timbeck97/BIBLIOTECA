package aplicacao;

import java.util.List;

import biblioteca.Livro;

public class Tela {
	
	
	public  static void imprimeAcervo(List<Livro> acervo) {
		System.out.println("--------------------");
		System.out.println("ID   Disponibilidade    Nome do livro\n");
		for(Livro livro: acervo) {
			System.out.println(livro.getId()+"    "+livro.disponibilidade()+"                "+livro);
		}
	}
	public static void buscaLivro(List<Livro> acervo, String palavra) {
		for(Livro livro: acervo) {
			if(livro.getTitulo().contains(palavra)) {
				System.out.printf(String.format("%02d",livro.getId())+"    "+livro.disponibilidade()+"                "+livro);
				System.out.println();
			}
			
		}
	}
	
}
