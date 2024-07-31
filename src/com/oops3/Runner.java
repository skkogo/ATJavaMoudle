package com.oops3;

import com.google.gson.Gson;

public class Runner {
	public static void main(String[] args) {
		ProblemsPOJO[] prob = new ProblemsPOJO[2];
		prob[0] = new ProblemsPOJO(7, "Audio Jack is not working");
		prob[1] = new ProblemsPOJO(55, "Screen is broken");

		CustomerProductPOJO customerProd = new CustomerProductPOJO("5667456", "12345678801234", "09876543210987",
				"23456789012345", "759588", 890009, 8);
		CustomerAddressPOJO customerAddress = new CustomerAddressPOJO("788", "Shrishti Apartment", "Kursi Road",
				"RK School", "lucknow", "226021", "India", "UttarPradesh");
		CustomerPOJO customer = new CustomerPOJO("Saurabh", "Kumar", "899987898", "9899998999", "abdk@gmail.com",
				"samjjj@gmail.com");
		CreateJobPOJO job = new CreateJobPOJO(55, 877, 76, 6, customer, customerAddress, customerProd, prob);
		Gson gson = new Gson();
		String GData = gson.toJson(job);

		System.out.println(job);
		System.out.println("");
		System.out.println(GData);
	}

}
