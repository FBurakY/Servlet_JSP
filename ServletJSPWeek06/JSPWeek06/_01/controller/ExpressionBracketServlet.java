package _01.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExpressionBracketServlet")
public class ExpressionBracketServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("key1", "Value");
		map.put("key2", "Value");
		map.put("key3", "Value");
		map.put("key4", "Value");
		map.put("key5", "Value");
		map.put("key6", "Value");
		
		List<String> myList = new ArrayList<String>();
		myList.add("Element1");
		myList.add("Element2");
		myList.add("Element3");		
		
		req.setAttribute("myMap", map);
		req.setAttribute("myList", myList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("expressionLangueBracket.jsp");
		
		dispatcher.forward(req, resp);
		
	}
	
}
