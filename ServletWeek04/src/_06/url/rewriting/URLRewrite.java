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
		
		// Aþaðýda ki kodda ReWriting yapýyoruz cookiler kapalý olsa dahi sessionID eklenmektedir ...
		// Aþaðýda browserde cookie kapalý olsa dahi sessionID browser'a göndermekteyiz . 
		// Bunun için resp.encodeUrl() metodunu kullanmaktayýz ... 
		// Cookie browser'da kapalý ise JSessionID Eklemektedir . 
		// Cookie browser'da açýk ise ReWriting JSessionID Eklememektedir .
		
		// encodeUrl metodunu kullanmazsak ve cookie kapalýysa sessionlarý kullanamayýz .
		// çünkü session bilgisi (sessionID) bilgisi default olarak cookiler aracýlýðýyla taþýnmaktadýr . 
		
		String encodeUrl = resp.encodeUrl("getSessionAttribute");
		
		pw.print("<html><body>");
		pw.println("Giris - <a href=\"" + nonEncodedUrl + "\"> Click Here</a>.");
		
		// 
		pw.println("Giris - <a href=\"" + encodeUrl + "\"> Click Here</a>.");
		
		
	}	 
}
