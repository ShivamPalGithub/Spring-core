package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollno;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	private Subjects subjects;
	
	
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}

	public void display() {
		System.out.println("rollno  :" + rollno);
		System.out.println("name   :" + name);
		System.out.println("address :" + address);
		System.out.println("subjects :"+subjects);

	}

}
