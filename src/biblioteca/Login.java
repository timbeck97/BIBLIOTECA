package biblioteca;

import java.util.List;

public class Login {
	
	public Login() {
		
	}
	
	public static Pessoa validaLogin(String login, String senha, List<Pessoa> lista) {
		for(Pessoa p : lista) {
			if(login.equals(p.getLogin())) {
				if(senha.equals(p.getSenha())) {
					return p;
				}
				
			}
		}
		return null;
		
		
		
		
	}
}
