package com.inheritanceday1;

public abstract class Employee extends Person {
protected int emplyeID;

public Employee(String name, int age, char gender, String email, String adress, int emplyeID) {
	super(name, age, gender, email, adress);
	this.emplyeID = emplyeID;
}

public int getEmplyeID() {
	return emplyeID;
}

public void setEmplyeID(int emplyeID) {
	this.emplyeID = emplyeID;
}

@Override
public String toString() {
	return "Employee [emplyeID=" + emplyeID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email="
			+ email + ", adress=" + adress + "]";
}


}
