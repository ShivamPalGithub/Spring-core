package in.sp.beans;

public class Address {

	private int housno;
	private String city;
	private int pincode;

	public int getHousno() {
		return housno;
	}

	public void setHousno(int housno) {
		this.housno = housno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

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
