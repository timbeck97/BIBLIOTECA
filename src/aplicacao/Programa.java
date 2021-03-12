package aplicacao;

import biblioteca.Biblioteca;

public class Programa {

	public static void main(String[] args) {
		
		Biblioteca b=new Biblioteca();
		b.adicionaLivro("Livro teste");
		Tela.imprimeAcervo(b.getAcervo());
		

	}

}
