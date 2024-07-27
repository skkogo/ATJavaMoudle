package com.inheritanceday1;

public abstract class Person {
	protected String name;
	protected int age;
	protected char gender;
	protected String email;
	protected String adress;
	public Person(String name, int age, char gender, String email, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", adress="
				+ adress + "]";
	}

}
