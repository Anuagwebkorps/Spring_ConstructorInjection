package pp;

import java.util.Map;

public class Books {
private String name;
private String publisher;
private Map<Writer,Students> details;
public Books(String name, String publisher, Map<Writer, Students> details) {
	super();
	this.name = name;
	this.publisher = publisher;
	this.details = details;
}
public Books() {
	super();
	// TODO Auto-generated constructor stub
}
public void show()
{
	System.out.println(name+" "+publisher);
	for(Map.Entry<Writer, Students> i:details.entrySet())
	{
		Writer w=i.getKey();
		System.out.println(w);
		Students s=i.getValue();
		System.out.println(s);
	}
}
}
