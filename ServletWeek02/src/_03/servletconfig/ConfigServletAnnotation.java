package _03.servletconfig;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/configAnnotation", initParams = @WebInitParam(name="role",value = "admin"))
public class ConfigServletAnnotation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String role = getServletConfig().getInitParameter("role");
		resp.getWriter().print(role);
		
		//Annotation Y�ntemiyle Yukar�da ki gibi xml'e yazmadan da kullana biliriz .
		//Genel olarak s�k kullan�lan y�ntem Annotation Y�ntemidir. 
	} 
	
}
