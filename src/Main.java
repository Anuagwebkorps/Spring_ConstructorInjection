import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pp.Book;
import pp.Books;
import pp.Emp;
import pp.Empp;
import pp.Student;
//import pp.Vendor;
//import pp.Vendors;
import pp.Student1;
import pp.Vendor;
import pp.Vendors;

public class Main {

	public static void main(String[] args) {
		// 1) ci with primitives and String
		//ApplicationContext cx=new ClassPathXmlApplicationContext("apc.xml");
		//Empp e=(Empp)cx.getBean("e");
		//System.out.println(e);
		//e.show();

		//2) ci with dependent classes
		//ApplicationContext cx=new ClassPathXmlApplicationContext("ap1.xml");
		//Student1 ss=(Student1) cx.getBean("s");
		//ss.show();
		
		// 3)constructor injection with predefine classes
		//ApplicationContext cx=new ClassPathXmlApplicationContext("ap2.xml");
		//Vendor v=(Vendor) cx.getBean("v");
		//v.show();
		//4)constructor injection with userdefine classes
        //ApplicationContext cx=new ClassPathXmlApplicationContext("ap3.xml");
		//Vendors v=(Vendors) cx.getBean("v");
		//v.show();
		
		//5) ci with collection with predefined using Map
		//ApplicationContext cx=new ClassPathXmlApplicationContext("ap4.xml");
		//Book b=(Book) cx.getBean("b");
		//b.show();
		//6)ci with collection with userdefined using Map
	     ApplicationContext cx=new ClassPathXmlApplicationContext("ap5.xml");
	     Books b=(Books) cx.getBean("b");
		 b.show();
	}

}
