package in.sp.beans;

public class Address {

	private int houseno;
	private String city;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int houseno, String city, int pincode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public void display() {
		System.out.println("houseno :" + houseno);
		System.out.println("city :" + city);
		System.out.println("pincode :" + pincode);

	}

}
