package pp;

public class Writer {
private String wname;
private String qualification;
public Writer(String wname, String qualification) {
	super();
	this.wname = wname;
	this.qualification = qualification;
}
public Writer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Writer [wname=" + wname + ", qualification=" + qualification + "]";
}

}
