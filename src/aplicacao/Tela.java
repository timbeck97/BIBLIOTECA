package aplicacao;

import java.util.List;

import biblioteca.Livro;

public class Tela {
	
	public static void imprimeMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("|   1 - Acessar o acervo                |");
		System.out.println("|   2 - Buscar livro no acervo          |");
		System.out.println("|   3 - Retirar livro                   |");
		System.out.println("|   4 - Devolver livro                  |");
		System.out.println("|   5 - Encerrar                        |");
		System.out.println("-----------------------------------------");
		System.out.print("Digite a opcao desejada: ");
	}
	public  static void imprimeAcervo(List<Livro> acervo) {
		System.out.println("--------------------");
		System.out.println("ID   Disponibilidade    Nome do livro\n");
		for(Livro livro: acervo) {
			System.out.println(String.format("%02d",livro.getId())+"    "+livro.disponibilidade()+"                "+livro);
		}
		System.out.println("");
	}
	public static void buscaLivro(List<Livro> acervo, String palavra) {
		System.out.println("\n");
		System.out.println("\n");
		for(Livro livro: acervo) {
			if(livro.getTitulo().contains(palavra)) {
				System.out.printf(String.format("%02d",livro.getId())+"    "+livro.disponibilidade()+"                "+livro);
				System.out.println();
				
				
			}
			
		}
		System.out.println("");
		
	}
	
}
