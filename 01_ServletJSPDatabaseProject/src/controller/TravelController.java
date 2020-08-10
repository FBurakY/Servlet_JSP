package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TravelDAO;
import dao.TravelDAOImpl;
import model.Travel;


@WebServlet("/travelController")
public class TravelController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//int idTravel = Integer.parseInt(req.getParameter("idtravel"));
		//TravelDAO travel = new TravelDAOImpl();
		//travel.removeTravel(idTravel);
		
		
		
		// Listeleme Ýþlemini Yapýyoruz ....
		TravelDAO travelDao = new TravelDAOImpl();				
		List<Travel> travelList = travelDao.getTravel();
		req.setAttribute("allTravels",travelList);				
		RequestDispatcher dispatcher = req.getRequestDispatcher("travel.jsp");
		dispatcher.forward(req, resp);
	}	
}
