package _06.dowloand;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dowloandServlet")
public class DowloandServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Geriye Excel Döneceðimizi göstermekteyiz ...
		resp.setContentType("application/ms-excel");
		resp.setHeader("Content-Disposition", "attachment; filename=test.xlsx");
		
		// Apache Poi ; word , excel vs. oluþturmak için Apache Poi kullanýlmaktadýr ...
		// Jasper Repot ; pdf oluþturmak için kullanýlmaktadýr ...
		
		InputStream is = getServletContext().getResourceAsStream("Dowloand.xlsx");
		int read = 0;
		byte[] bytes = new byte[1024];
		ServletOutputStream sos = resp.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			sos.write(bytes, 0, read);
		}
		
		sos.close();
	}	
}
