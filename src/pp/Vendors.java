package pp;

import java.util.List;

public class Vendors {
private int vid;
private String vname;
private String address;
private List<Custmer> custmers;
public Vendors(int vid, String vname, String address, List<Custmer> custmers) {
	super();
	this.vid = vid;
	this.vname = vname;
	this.address = address;
	this.custmers = custmers;
}
public Vendors() {
	super();
	// TODO Auto-generated constructor stub
}
public void show()
{
	System.out.println(vid+" "+vname+" "+address);
	for(Custmer c:custmers)
	{
		System.out.println(c);
	}
}
}
