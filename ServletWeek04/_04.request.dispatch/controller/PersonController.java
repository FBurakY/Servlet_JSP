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
		
		// Aþaðýda ki örnek de :
		
		// Burada istek person controller gelecek ve biz burada isteði karþýladýktan sonra ayný zamanda JSP dosyasýndan da faydalanacaðýz.
		// Burada basit bir JSP dosyasý oluþturacaðýz ...
		// Datayý manuel olarak ekleyeceðiz ...
		// Genel mantýk þu þekilde olacak ; 
		// Controller -> Servis Katmanýna Eriþecek -> Dau Katmanýna eriþecek 
		// Dau Katmanýndan verilerimiz geldikten sonra direkt olarak JSP ye Attribute döneriz .
		
		// Controllerden direk veritabanýna baðlantý yapýlmaz arada servis katmaný vardýr ve dau katmanýndan veritabaný baðlantý iþlemleri yapýlýr .
		
		// Yukarýdan aþaðýya doðru iþlem yapýlmaktadýr : Controller Layer -> Service Layer -> Dau Layer 
		
		// Bu örnekte basitçe querynin çalýþtýðýný farz edelim . Dau katmanýna gidip datanýn geldiðini düþünelim .
		// Basitçe bir liste oluþturacaðýz ve o listeyi JSP ye göndereceðiz .
		
		Person person = new Person("Fadil", "Yurtsever");
		
		Person personOne = new Person("Burak", "Yurtsever");
		
		Person personTwo = new Person("Fadil Burak", "Yurtsever");
		
		// * Þimdi biz Servlet'lerde servlet içerisine html kodu yazmýþtýk ama çok fazla yapýlan bir þey deðildir .
		// * Bizim yapmamýz gereken durum datayý alýp : JSP dosyasýna veya view dosyasýna dispatch etmektir !!!
		
		//Burada ki datanýn veritabanýndan geldiðini düþünelim ...
		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(personOne);
		personList.add(personTwo);
		
		// Bu kýsýmlar query sonrasý veritabanýndan gelsin ...
		
		// Bir istek geldiðinde hem controller hemde servlet kullanýlsýn hemde JSP dosyasý kullanýlsýn bunu yapmak için ;
		// Request Dispatch yapýyoruz : Spring MVC ' de ayný mantýkla çalýþýr . Orada ise controller çalýþtýktan sonra module attribute dönüyor 
		// Module Attribute ayný JSP dosyasýna dönüyor . Request dispatch mantýðý yapýlmýþ oluyor .
		
		// req.setAttribute(name, o) , Request Scope Objeyi Ekliyoruz ...
		req.setAttribute("persons", personList);
		// Yukarýda ki þekilde Request Scopa Objeyi eklemiþ oluyorum . 
		// Þimdi bu istek karþýlanýrken hem Servlet hemde JSP Kullanýlýyor . Ve bu tek bir istek oluyor . Tek bir istek olduðu içinde
		// Request Scope'a objeyi eklediðimde 'personView.jsp' de ilgili attribute'ye eriþmiþ oluyorum böylece request attributeyi kullanmýþ oluyorum.
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/person/personView.jsp");
		// getRequestDispatcher("") bu kýsýmda dispatch edeceðimiz JSP olacak . 
		dispatcher.forward(req, resp);
		// Yukarýdaki kýsýmda ; dispatcher.forward(req, resp) ayný request dispatch objesini kullan anlamýna geliyor .
		// Bu þekilde isteði dispatch ediyoruz . Ýstek karþýlandýðýnda iþin içine JSP dosyasýnýda katýyoruz .
		// Yani isteði karþýlarken hem servler hemde JSP den faydalanýyoruz ... 
	} 	
	
}
