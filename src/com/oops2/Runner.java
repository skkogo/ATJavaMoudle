package com.oops2;

public class Runner {

	public static void main(String[] args) {
		Contact c1 = new Contact("Saurav", "Kumar", "+91 9988999000");
		c1.setFirstName("Saurabh");
		c1.save();
		System.out.println(c1);

		System.out.println(" ");

		Contact c2 = new Contact("Mukesh", "Kumar", "+91 9887779000");
		c2.save();
		System.out.println(c2);

	}

}
