package biblioteca;

public class Pessoa {
	private String nome;
	private String login;
	private String senha;
	private int cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int cpf, String login, String senha) {
		this.nome=nome;
		this.cpf=cpf;
		this.login=login;
		this.senha=senha;
	}
	
	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	
	
	
	
	
}
