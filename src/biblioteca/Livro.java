package biblioteca;

public class Livro {
	private String titulo;
	private boolean disponibilidade;
	
	public Livro() {
		
	}
	public Livro(String titulo) {
		this.titulo=titulo;
		this.disponibilidade=true;
	}
	public String getTitulo() {
		return titulo;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
}
