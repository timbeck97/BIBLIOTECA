package aplicacao;

import java.util.Scanner;

import biblioteca.Biblioteca;
import biblioteca.Login;
import biblioteca.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcao=0;
		
		Biblioteca b=new Biblioteca();
		Pessoa pessoa;
		do {
			System.out.print("Digite o login: ");
			String login=sc.next();
			System.out.print("Digite a senha: ");
			String senha=sc.next();
			pessoa= Login.validaLogin(login, senha, b.getClientes());
			if(pessoa==null) {
				System.out.println("Login ou senha invalidos!");
			}
			else {
				System.out.println("Login correto!");
			}
		 } while(pessoa==null);
		while(opcao!=5) {
			Tela.imprimeMenu();
			switch(sc.nextInt()) {
				case 1: Tela.imprimeAcervo(b.getAcervo());
						System.out.println("OK para continuar");
						sc.nextLine();
						sc.next();
						break;
				case 2:System.out.print("Digite o nome do livro: ");
						String p=sc.next();
						Tela.buscaLivro(b.getAcervo(), p);
						System.out.println("OK para continuar");
						sc.nextLine();
						sc.next();
						break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
