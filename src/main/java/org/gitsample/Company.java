package org.gitsample;

public class Company {

	private String name;
	private String address;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}
	// Just a comment!
	
}
