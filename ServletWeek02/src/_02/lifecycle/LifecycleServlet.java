package _02.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		//Konfigurasyon yapýlmaktadýr 
		System.out.println("life-cycle init");
		
	}	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		pw.write("Life-Cycle Servlet #doGET");
		System.out.println("Life-Cycle #doGET is called."); 
		System.out.println("Test Method");
	}
	
	@Override
	public void destroy() {
		//Kodda herhangi bir deðiþiklik yaptýðýmýz zaman çalýþmaktadýr.
		System.out.println("Destroying ...");
	}
}
