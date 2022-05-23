package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user"); 	//Recoge los parametros de ususario
		String pwd=request.getParameter("pwd");		//Recoge los parametros de contraseña
		
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
		
			rd=request.getRequestDispatcher("Bienvenida"); //Nos dirige hacia el servelet de Bienvenida
		}else {
			rd=request.getRequestDispatcher("Error");	//Nos dirige hacia el servelet de Error
		}
		rd.forward(request, response); 	//Hacemos la transferencia de peticion mediante la llamada forward
		
	}

	
}
