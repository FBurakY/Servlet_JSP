package _02.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImp implements ServletContextListener {
	
	// 2 Farklý þekilde declaration yapýlmaktadýr.
	// 1 - ) xml þeklinde
	// 2 - ) Anatation þeklinde 
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Initizlized");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed");
		
	}

	
	
}
