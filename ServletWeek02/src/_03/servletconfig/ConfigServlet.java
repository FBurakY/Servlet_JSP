package _03.servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("username");		
		String pass = config.getInitParameter("password");
		
		resp.getWriter().print(name + " " + pass);
		
		//Yukarýda config üzerinden getInitParameter metodunu kullanarak bu parametre bilgilerine eriþim saðlaya biliyoruz ...
		
		String ServletName = config.getServletName();
		ServletContext context = config.getServletContext();
		Enumeration<String> names =config.getInitParameterNames();		
		
		
	}

}
