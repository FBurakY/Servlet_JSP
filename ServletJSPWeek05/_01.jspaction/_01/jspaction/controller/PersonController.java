package _01.jspaction.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01.jspaction.model.Person;


@WebServlet("/person")
public class PersonController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Ýlgili Person Objesini getiriyoruz 
		// Ýlgili isteðin karþýþanmasý ve listeyi oluþturma kýsmý .
		
		Person person = new Person("Fadil", "Sever", 26);
		
		req.setAttribute("myPerson", person);
		//RequestDispatcher dispacher = req.getRequestDispatcher("person.jsp");
		RequestDispatcher dispacher = req.getRequestDispatcher("personUseBean.jsp");
		dispacher.forward(req,resp);
		
		// Dispacher mantýðýnda bir istek karþýlanýrken , iki compenent ve view kullanýyor . 
		// Ortada bir tane istek var dolayýsla istek karþýlanýrken controller bir kýsmýný yapýyor 
		// View bir kýsmýný yapýyor .
		
	}
	
}
