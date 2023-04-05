package servicos;

import dao.UsuarioDao;
import modelo.Usuario;


public class LoginServicos {
	public boolean verificarUsuario(Usuario usuario) {
		UsuarioDao dao = new UsuaoDao ();
		
		Usuario u = dao.validarLogin(usuario);
		
		if(usuario.getUsuario().equals("gabrielle") && usuario.getSenha().equals("123456")) {
			
			return true;
		}else {
			return false;
		}
	}
}