package pp;

import java.util.List;

public class Vendor {
	//constructor injection with predefine classes
private String name;
private String address;
private List<String> customers;
public Vendor(String name, String address, List<String> customers) {
	super();
	this.name = name;
	this.address = address;
	this.customers = customers;
}
public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}
public void show()
{
	System.out.println(name+" "+address);
	for(String s:customers)
	{
		System.out.println(s);
	}
}
}
