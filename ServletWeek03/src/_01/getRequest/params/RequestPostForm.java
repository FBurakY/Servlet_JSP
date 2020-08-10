package _01.getRequest.params;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestPostForm")
public class RequestPostForm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Request Post Form #doPost");
		//Request objesini kullanarak , kullanýcýnýn dýþarýdan girdiði bilgilere eriþim saðlaya bileceðiz.
		String firstName = req.getParameter("firstName");
		String lastName  = req.getParameter("lastName");
		String gender  = req.getParameter("gender");
		String marital_status  = req.getParameter("marital status");
		String[] langs = req.getParameterValues("lang");
		
		PrintWriter pw = resp.getWriter();
		pw.println(firstName);
		pw.println(lastName);
		pw.println(gender);
		pw.println(marital_status);
		pw.println(Arrays.asList(langs)); 
		
	}

}
