import java.util.Date;

public class Person {

	private String name;
	private Date dob;

	public Person() {
	}

	public Person( String name ) {
		this.name = name;
		this.dob = new Date();
	}

	public Person( String name, Date date ) {
		this.name = name;
		this.dob = date;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob( Date dob ) {
		this.dob = dob;
	}

	public String toString() {
		return "Person(name:" + name + ", dob:" + dob + ")";
	}
}
