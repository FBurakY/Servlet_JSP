package _01.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/annotationServlet")

//Eðer birden fazla annatation vermek istersek ise aþaðýda ki gibi yazarýz
@WebServlet(urlPatterns = {"/annotationServlet","/annotationServletUrl"})
public class AnnotationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
     PrintWriter pw =	resp.getWriter();
     pw.print("<h1>Annotation Servlet</h1>");   
	}
	
}
