package pp;

public class Empp {
private int id;
private String name;
public Empp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Empp [id=" + id + ", name=" + name + "]";
}
public void show()
{
	System.out.println(id+""+name);
}
public Empp() {
	super();
	// TODO Auto-generated constructor stub
}
}
