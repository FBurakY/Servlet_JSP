package _02.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListenerImp2 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContextListenerImp2 contextInitialized :");		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContextListenerImp2 contextDestroyed :");		
	}

	
	
}
