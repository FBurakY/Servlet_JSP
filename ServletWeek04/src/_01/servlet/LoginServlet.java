package _01.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Bu K�s�m �al��madan �nce ilgili Filter �al��mas�n� istiyoruz . 
		System.out.println("Login Servlet # doPost");
		String username = req.getParameter("username");
		System.out.println(username);
	}	
}
