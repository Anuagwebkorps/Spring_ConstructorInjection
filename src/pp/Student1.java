package pp;

public class Student1 {
//constructor injection with dependent classes	
private int roll;
private String name;
private String branch;
private Adress adress;
public Student1(int roll, String name, String branch, Adress adress) {
	super();
	this.roll = roll;
	this.name = name;
	this.branch = branch;
	this.adress = adress;
}
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
public void show()
{
	System.out.println(roll+" "+name+" "+branch);
	adress.display();
}
}
