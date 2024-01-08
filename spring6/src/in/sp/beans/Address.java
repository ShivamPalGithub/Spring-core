package in.sp.beans;

public class Address {

	private int housno;
	private String city;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int housno, String city, int pincode) {
		super();
		this.housno = housno;
		this.city = city;
		this.pincode = pincode;
	}

	// "8485898239" ""9004044227
	// chaster it solution pvt 08878279416
	@Override
	public String toString() {
		return "Address [housno=" + housno + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public void display() {
		System.out.println("housno  :" + housno);
		System.out.println("city   :" + city);
		System.out.println("pincode :" + pincode);

	}

}
