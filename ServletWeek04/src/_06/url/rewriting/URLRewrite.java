package _06.url.rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/urlWrite")
public class URLRewrite extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.setAttribute("key", "object value");
		
		PrintWriter pw = resp.getWriter();		
		
		String nonEncodedUrl="getSessionAttribute";
		//bu sekilde encodeURL metodunu kullandigimizda cookie browserda kapaliysa url sonuna JSESSIONID bilgisi eklenir!
		//cooke aciksa eklenmez!
		
		// A�a��da ki kodda ReWriting yap�yoruz cookiler kapal� olsa dahi sessionID eklenmektedir ...
		// A�a��da browserde cookie kapal� olsa dahi sessionID browser'a g�ndermekteyiz . 
		// Bunun i�in resp.encodeUrl() metodunu kullanmaktay�z ... 
		// Cookie browser'da kapal� ise JSessionID Eklemektedir . 
		// Cookie browser'da a��k ise ReWriting JSessionID Eklememektedir .
		
		// encodeUrl metodunu kullanmazsak ve cookie kapal�ysa sessionlar� kullanamay�z .
		// ��nk� session bilgisi (sessionID) bilgisi default olarak cookiler arac�l���yla ta��nmaktad�r . 
		
		String encodeUrl = resp.encodeUrl("getSessionAttribute");
		
		pw.print("<html><body>");
		pw.println("Giris - <a href=\"" + nonEncodedUrl + "\"> Click Here</a>.");
		
		// 
		pw.println("Giris - <a href=\"" + encodeUrl + "\"> Click Here</a>.");
		
		
	}	 
}
