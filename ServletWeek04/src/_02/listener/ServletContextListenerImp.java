package _02.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImp implements ServletContextListener {
	
	// 2 Farkl� �ekilde declaration yap�lmaktad�r.
	// 1 - ) xml �eklinde
	// 2 - ) Anatation �eklinde 
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Initizlized");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed");
		
	}

	
	
}
