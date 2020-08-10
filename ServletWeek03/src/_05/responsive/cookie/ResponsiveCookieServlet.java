package _05.responsive.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responsiveCookieServlet")
public class ResponsiveCookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Cookie özel resposive headerlerdir , cookieler kullanýcýn tarayýcýsýnda saklanan küçük gizli bilgilerdir .
		// Cookiler son kullanýcýn tarayýcýsýnda saklanan küçük bilgilerdir ...
		// Cookie bilgisini serverden alýrýz . 
		
		
		Cookie userCookie = new Cookie("admin", "Fadil");
		resp.addCookie(userCookie);
		
	}
	
}
