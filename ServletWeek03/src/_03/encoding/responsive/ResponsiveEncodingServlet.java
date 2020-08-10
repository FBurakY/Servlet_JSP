package _03.encoding.responsive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responsiveEncodingServlet")
public class ResponsiveEncodingServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String defaultEncoding = resp.getCharacterEncoding();
		System.out.println(defaultEncoding);
		
		// ISO-8859-9 Bizim Kullandýðýmýz karakter kümesidir ...
		// Encoding kendimiz deðiþtirmek istersek . 
		
	    //resp.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("UTF-8");
		
		//Türkçe karakter problemidir. 		
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head> <meta charset='UTF-8'> </head>");
		//pw.print("<head> <meta charset='ISO-8859-9'> </head>");
		pw.print("<body>");
		pw.print("ýÝþÞçÇüÜðÐ");
		pw.print("</body> </html>");	
		
		System.out.println(defaultEncoding);
		
		//Problemin 2 sebebi vardýr ;
		// 1 - Kullanýlan karakterler ilgili karakter kümesi tarafýndan destekleniyor mu ? 
		// 2 - Her iki uçtada kullanýlan encoding (charset) ayný mý ?
		
		//Not ; Bunlarada farklýlýk olduðu zaman karakter bozulmasýna sebeb olacaktýr . 	
		
		// Tarayýcýclar varsayýlan olarak ISO-8859-1(Latin) Encoding kullanmaktayýz . 
		
		// Not ; Türkçe karakter problemiyle karþýlaþmamak için char set vermemiz gerekmekte ki varsayýlan kullanmasýn . 
		// Her zaman kullandýðýmýz encoding kendimiz çift taraflý char setini ayarlamamýz gerekmektedir ...			
	}
}
