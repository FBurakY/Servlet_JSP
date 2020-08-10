package _05.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/helloSession")
public class HelloSession extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		// Bu �rnek ilk �al��t���nda bir sessionID olmayacakt�r . 
		// Sonra ki istekler de ise yen do�mu� olan sessionID mevcut olacakt�r .
		
		PrintWriter pw = resp.getWriter();
		if(session.isNew()) {
			pw.print("New Session");
		}
		else {
			pw.print("Old Session");
		}
	}
}
