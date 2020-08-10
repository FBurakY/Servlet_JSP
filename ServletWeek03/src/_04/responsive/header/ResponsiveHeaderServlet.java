package _04.responsive.header;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responsiveHeaderServlet")
public class ResponsiveHeaderServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Arkada planda rest mantýðýyla çalýþýrsak data dönebiliriz ...
		resp.addHeader("username", "test user1");
		resp.addHeader("username", "test user2");
		resp.setHeader("password", "old");		
		resp.setHeader("password", "new");
		
		//Responsive Header'lar client dönen küçük bilgilerdir bunlar implicit kapalý bilgilerdir.		
	}	
}
