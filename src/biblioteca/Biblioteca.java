package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> acervo;
	private List<Pessoa> clientes;
	private int id_livros=0;
	
	public Biblioteca() {
		this.acervo=new ArrayList<Livro>();
		this.clientes=new ArrayList<Pessoa>();
		acervoInicial();
		listadecadastroInicial();
	}

	public List<Livro> getAcervo() {
		return acervo;
	}

	public List<Pessoa> getClientes() {
		return clientes;
	}

	public int getId_livros() {
		return id_livros;
	}
	
	public void adicionaLivro(String titulo) {
		acervo.add(new Livro(titulo, id_livros));
		id_livros++;
	}
	public void retiraLivro(int id) {
		for(Livro livro : acervo) {
			if(livro.getId()==id) {
				livro.setDisponibilidade();
			}
		}
	}
	public void acervoInicial() {
		adicionaLivro("O Pequeno Principe");
		adicionaLivro("O Codigo da Vinci");
		adicionaLivro("O Crime do Padre Amaro");
	}
	public void listadecadastroInicial() {
		clientes.add(new Pessoa("Tim Beck", 0426322, "tim", "bolinho"));
		clientes.add(new Pessoa("Keila Massaia", 1234, "keila", "pao"));
	}
	
	
}
