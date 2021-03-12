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
				acervo.remove(livro);
			}
		}
	}
	
	
}
