package jdbc.demo.bo;

public class Customer {
	int customerID;
	String customerName;
	String contactName;
	String address;
	String city;
	String potalCode;
	String country;
	
	public Customer(int customerID, String customerName, String contactName, String address, String city,
			String potalCode, String country) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.contactName = contactName;
		this.address = address;
		this.city = city;
		this.potalCode = potalCode;
		this.country = country;
		
		
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPotalCode() {
		return potalCode;
	}

	public void setPotalCode(String potalCode) {
		this.potalCode = potalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
