package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import servicos.LoginServicos;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		
		
		usuario.setUsuario(request.getParameter("txtUsuario"));
		usuario.setSenha(request.getParameter("txtSenha"));
		
		LoginServicos servico = new LoginServicos();
		
		if(servico.verificarUsuario(usuario)) {
			response.sendRedirect("home.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
	}

}
