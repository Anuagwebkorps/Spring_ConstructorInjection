package pp;

public class Adress {
//constructor injection with dependent classes	
private String street;
private String city;
private String state;

public Adress(String street, String city, String state) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
}
public Adress() {
	super();
	// TODO Auto-generated constructor stub
}
public void display()
{
	System.out.println(street+" "+city+" "+state);
}
}
