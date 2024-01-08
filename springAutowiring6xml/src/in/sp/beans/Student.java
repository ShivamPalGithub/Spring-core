package in.sp.beans;

public class Student {

	private String name;
	private int rollno;
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
	}

	public void display() {
		System.out.println("name :" + name);
		System.out.println("rollno :" + rollno);
		System.out.println("address :" + address);

	}
}
