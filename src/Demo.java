

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pp.Emp;

public class Demo {
	

	public static void main(String[] args) {
		Resource r=new ClassPathResource("Firstspring.xml");
		BeanFactory fa=new XmlBeanFactory(r);
		Emp e=(Emp) fa.getBean("e");
		System.out.println(e.getId()+" "+e.getName());
		Emp e1=(Emp) fa.getBean("e1");
		System.out.println(e1.getId()+" "+e1.getName());
	}
/*The Resource object represents the information of Firstspring.xml file. 
 *The Resource is the interface and the ClassPathResource is the implementation
 * class of the Reource interface. The BeanFactory is responsible to return the 
 * bean. The XmlBeanFactory is the implementation class of the BeanFactory. 
 * There are many methods in the BeanFactory interface. One method is getBean(),
 * which returns the object of the associated class. */

}
