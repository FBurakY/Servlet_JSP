package _01.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("My First Servlet is Runnig");
		PrintWriter pw = resp.getWriter();
		
		LocalTime lt = LocalTime.now();
		String message = "First Message";
		
		pw.print("<h1>"+lt+"</h1>");
		pw.print("<h1>"+message+"</h1>");
		
	}

}
