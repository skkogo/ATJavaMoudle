package com.oops;

public class Person {
	private String name;
	private char gender;
	private String address;
	private String contact;
	public String getName() {
		return name;
	}
	public Person(String name, char gender, String address, String contact) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.contact = contact;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
