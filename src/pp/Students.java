package pp;

public class Students {
private int roll;
private String name;
private String branch;
public Students() {
	super();
	// TODO Auto-generated constructor stub
}
public Students(int roll, String name, String branch) {
	super();
	this.roll = roll;
	this.name = name;
	this.branch = branch;
}
@Override
public String toString() {
	return "Students [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
}

}
