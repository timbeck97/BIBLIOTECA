package biblioteca;

public class Livro {
	private String titulo;
	private boolean disponibilidade;
	private int id;
	
	public Livro() {
		
	}
	public Livro(String titulo, int id) {
		this.titulo=titulo;
		this.disponibilidade=true;
		this.id=id;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade() {
		this.disponibilidade=true?false:true;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return titulo;
	}
	public String disponibilidade() {
		if(disponibilidade) {
			return "[D]";
		}
		else
			return "[ ]";
	}
}
