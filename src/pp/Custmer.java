package pp;

public class Custmer {
private String name;
private String email;
private long mob;
public Custmer() {
	super();
	// TODO Auto-generated constructor stub
}
public Custmer(String name, String email, long mob) {
	super();
	this.name = name;
	this.email = email;
	this.mob = mob;
}
@Override
public String toString() {
	return "Custmer [name=" + name + ", email=" + email + ", mob=" + mob + "]";
}

}
