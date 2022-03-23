

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pp.Emp;
import pp.Student;

public class Demo1 {

	public static void main(String[] args) {
		/*
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory fa=new XmlBeanFactory(r);
		Emp e=(Emp) fa.getBean("e");
		System.out.println(e.getId()+" "+e.getName());
		*/
		  /* IOC container */
		ApplicationContext cx=new ClassPathXmlApplicationContext("apc.xml");
		Student s=(Student) cx.getBean("s");
		System.out.println(s);
	}
/*The ClassPathXmlApplicationContext class is the implementation class of 
 * ApplicationContext interface. We need to instantiate the 
 * ClassPathXmlApplicationContext class to use the ApplicationContext 
*/
}
