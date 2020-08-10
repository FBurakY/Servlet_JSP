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
		
		// �lgili Person Objesini getiriyoruz 
		// �lgili iste�in kar���anmas� ve listeyi olu�turma k�sm� .
		
		Person person = new Person("Fadil", "Sever", 26);
		
		req.setAttribute("myPerson", person);
		//RequestDispatcher dispacher = req.getRequestDispatcher("person.jsp");
		RequestDispatcher dispacher = req.getRequestDispatcher("personUseBean.jsp");
		dispacher.forward(req,resp);
		
		// Dispacher mant���nda bir istek kar��lan�rken , iki compenent ve view kullan�yor . 
		// Ortada bir tane istek var dolay�sla istek kar��lan�rken controller bir k�sm�n� yap�yor 
		// View bir k�sm�n� yap�yor .
		
	}
	
}
