package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

@WebServlet("/person")
public class PersonController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// A�a��da ki �rnek de :
		
		// Burada istek person controller gelecek ve biz burada iste�i kar��lad�ktan sonra ayn� zamanda JSP dosyas�ndan da faydalanaca��z.
		// Burada basit bir JSP dosyas� olu�turaca��z ...
		// Datay� manuel olarak ekleyece�iz ...
		// Genel mant�k �u �ekilde olacak ; 
		// Controller -> Servis Katman�na Eri�ecek -> Dau Katman�na eri�ecek 
		// Dau Katman�ndan verilerimiz geldikten sonra direkt olarak JSP ye Attribute d�neriz .
		
		// Controllerden direk veritaban�na ba�lant� yap�lmaz arada servis katman� vard�r ve dau katman�ndan veritaban� ba�lant� i�lemleri yap�l�r .
		
		// Yukar�dan a�a��ya do�ru i�lem yap�lmaktad�r : Controller Layer -> Service Layer -> Dau Layer 
		
		// Bu �rnekte basit�e querynin �al��t���n� farz edelim . Dau katman�na gidip datan�n geldi�ini d���nelim .
		// Basit�e bir liste olu�turaca��z ve o listeyi JSP ye g�nderece�iz .
		
		Person person = new Person("Fadil", "Yurtsever");
		
		Person personOne = new Person("Burak", "Yurtsever");
		
		Person personTwo = new Person("Fadil Burak", "Yurtsever");
		
		// * �imdi biz Servlet'lerde servlet i�erisine html kodu yazm��t�k ama �ok fazla yap�lan bir �ey de�ildir .
		// * Bizim yapmam�z gereken durum datay� al�p : JSP dosyas�na veya view dosyas�na dispatch etmektir !!!
		
		//Burada ki datan�n veritaban�ndan geldi�ini d���nelim ...
		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(personOne);
		personList.add(personTwo);
		
		// Bu k�s�mlar query sonras� veritaban�ndan gelsin ...
		
		// Bir istek geldi�inde hem controller hemde servlet kullan�ls�n hemde JSP dosyas� kullan�ls�n bunu yapmak i�in ;
		// Request Dispatch yap�yoruz : Spring MVC ' de ayn� mant�kla �al���r . Orada ise controller �al��t�ktan sonra module attribute d�n�yor 
		// Module Attribute ayn� JSP dosyas�na d�n�yor . Request dispatch mant��� yap�lm�� oluyor .
		
		// req.setAttribute(name, o) , Request Scope Objeyi Ekliyoruz ...
		req.setAttribute("persons", personList);
		// Yukar�da ki �ekilde Request Scopa Objeyi eklemi� oluyorum . 
		// �imdi bu istek kar��lan�rken hem Servlet hemde JSP Kullan�l�yor . Ve bu tek bir istek oluyor . Tek bir istek oldu�u i�inde
		// Request Scope'a objeyi ekledi�imde 'personView.jsp' de ilgili attribute'ye eri�mi� oluyorum b�ylece request attributeyi kullanm�� oluyorum.
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/person/personView.jsp");
		// getRequestDispatcher("") bu k�s�mda dispatch edece�imiz JSP olacak . 
		dispatcher.forward(req, resp);
		// Yukar�daki k�s�mda ; dispatcher.forward(req, resp) ayn� request dispatch objesini kullan anlam�na geliyor .
		// Bu �ekilde iste�i dispatch ediyoruz . �stek kar��land���nda i�in i�ine JSP dosyas�n�da kat�yoruz .
		// Yani iste�i kar��larken hem servler hemde JSP den faydalan�yoruz ... 
	} 	
	
}
