package com.oops2;

public class Contact {
	private String firstName;
	private String lastName;
	private String ContactNumber;

	public void save() {
		System.out.println(firstName + " " + lastName + " " + "cotact has been saved");
	}

	public Contact(String firstName, String lastName, String contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		ContactNumber = contactNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", ContactNumber=" + ContactNumber + "]";
	}

}
