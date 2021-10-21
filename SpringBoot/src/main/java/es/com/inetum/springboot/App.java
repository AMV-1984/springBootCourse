package es.com.inetum.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.com.inetum.beans.Mundo;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("es/com/inetum/xml/beans.xml");
    	Mundo m = (Mundo)appContext.getBean("mundo");
    	
    	System.out.println(m.getSaludo());
    	
    	((ConfigurableApplicationContext) appContext).close();

    }
}
