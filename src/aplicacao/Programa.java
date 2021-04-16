package aplicacao;

import java.util.Scanner;

import biblioteca.Biblioteca;
import biblioteca.Login;
import biblioteca.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Biblioteca b=new Biblioteca();
		
		System.out.print("Digite o login: ");
		String login=sc.next();
		System.out.print("Digite a senha: ");
		String senha=sc.next();
		Pessoa pessoa= Login.validaLogin(login, senha, b.getClientes());
		if(pessoa==null) {
			System.out.println("Login ou senha invalidos!");
		}
		else {
			System.out.println(pessoa.getNome());
		}
		
		
		

	}

}
