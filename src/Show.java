
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pp.Student1;

public class Show {
          public static void main(String args[])
          { //with ApplicationContext IOC container
        	ApplicationContext ac=new ClassPathXmlApplicationContext("ap1.xml");
        	Student1 s=(Student1)ac.getBean("s");
    		s.show();
        	  
        	  
        	  //with BeanFactory IOC container:-
    		/*Resource resource=new ClassPathResource("ap1.xml");  
    		BeanFactory factory=new XmlBeanFactory(resource); 
    		Student1 s1=(Student1) factory.getBean("s");
    		s1.show();*/
          }
}
