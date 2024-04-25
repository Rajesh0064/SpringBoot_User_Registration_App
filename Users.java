package com.rajesh;

public class Users {
	private String name;
	private String password;
	private String email;
	private String mobileno;
	private String address;
	public Users() {
		super();

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", email=" + email + ", mobileno=" + mobileno
				+ ", address=" + address + "]";
	}
	public Users(String name, String password, String email, String mobileno, String address) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileno = mobileno;
		this.address = address;
	}
	
	
}
