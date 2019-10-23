package mx.com.ragnacode.springdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.ragnacode.beans.Marca;
import mx.com.ragnacode.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
    	Marca marca = new Marca();
    	
    	marca.setIdentificador(1);
    	marca.setNombre("Nike");
    	
    	//Leer el aplication context
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("mx/com/ragnacode/xml/beans.xml");
    	
    	ServiceMarca serviceMarca = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
    	
    	try {
    		serviceMarca.registrar(marca);
    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
