package pp;

import java.util.Map;

public class Book {
private int bid;
private String bname;
private Map<String,String> detail;
public Book(int bid, String bname, Map<String, String> detail) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.detail = detail;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public void show()
{
	System.out.println(bid+" "+bname);
	for(Map.Entry<String, String> i:detail.entrySet())
	{
		System.out.println(i.getKey()+" "+i.getValue());
	}
}
}
