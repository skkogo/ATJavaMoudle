package com.inheritanceday1;

public final class QA extends Employee{
	protected String techStack;

	public QA(String name, int age, char gender, String email, String adress, int emplyeID, String techStack) {
		super(name, age, gender, email, adress, emplyeID);
		this.techStack = techStack;
	}

	@Override
	public String toString() {
		return "QA [techStack=" + techStack + ", emplyeID=" + emplyeID + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", email=" + email + ", adress=" + adress + "]";
	}
	

}
