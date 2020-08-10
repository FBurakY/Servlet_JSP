package _03.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcontextAttributeServlet")
public class GetContextAttributeServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String attribute = (String) context.getAttribute("ContextAttributeKey");
		 
	}
	 
}
