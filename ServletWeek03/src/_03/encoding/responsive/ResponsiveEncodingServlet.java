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
		
		// ISO-8859-9 Bizim Kulland���m�z karakter k�mesidir ...
		// Encoding kendimiz de�i�tirmek istersek . 
		
	    //resp.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("UTF-8");
		
		//T�rk�e karakter problemidir. 		
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head> <meta charset='UTF-8'> </head>");
		//pw.print("<head> <meta charset='ISO-8859-9'> </head>");
		pw.print("<body>");
		pw.print("����������");
		pw.print("</body> </html>");	
		
		System.out.println(defaultEncoding);
		
		//Problemin 2 sebebi vard�r ;
		// 1 - Kullan�lan karakterler ilgili karakter k�mesi taraf�ndan destekleniyor mu ? 
		// 2 - Her iki u�tada kullan�lan encoding (charset) ayn� m� ?
		
		//Not ; Bunlarada farkl�l�k oldu�u zaman karakter bozulmas�na sebeb olacakt�r . 	
		
		// Taray�c�clar varsay�lan olarak ISO-8859-1(Latin) Encoding kullanmaktay�z . 
		
		// Not ; T�rk�e karakter problemiyle kar��la�mamak i�in char set vermemiz gerekmekte ki varsay�lan kullanmas�n . 
		// Her zaman kulland���m�z encoding kendimiz �ift tarafl� char setini ayarlamam�z gerekmektedir ...			
	}
}
