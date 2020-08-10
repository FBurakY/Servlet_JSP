package _01.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/expressionDoServlet")
public class ExpressionDoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("key1", "Value");
		map.put("key2", "Value");
		map.put("key3", "Value");
		map.put("key4", "Value");
		map.put("key5", "Value");
		map.put("key6", "Value");
		
		req.setAttribute("myMap", map);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("expressionLaungoDot.jsp");
		
		dispatcher.forward(req, resp);
		
	}
	
}
