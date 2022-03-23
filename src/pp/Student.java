package pp;

public class Student {
private int roll;
private String name;
public Student(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}
public Student() { //Default constructor 
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() { // obj 
	return "Student [roll=" + roll + ", name=" + name + "]";
}
//If you want to represent any object as a string, toString() method comes into existence.
//The toString() method returns the string representation of the object.
//If you print any object, java compiler internally invokes the toString() method on the 
//object. So overriding the toString() method, returns the desired output, it can be the 
//state of an object etc. depends on your implementation./
}
