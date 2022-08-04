package domainObjects;

public class PersonalDetails {
	
	private String country;
	private String address;
	private String email;
	private String phone;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public PersonalDetails(String country, String address, String email, String phone) {
		super();
		this.country = country;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

}
