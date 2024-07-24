package com.day7;

public class Palindrome {

	public static void main(String[] args) {
		String data = "madam";
		char[] dataArray = data.toCharArray();
		String reverse = "";
		for (int index = dataArray.length - 1; index >= 0; index--) {
			reverse = reverse + dataArray[index];

		}
		if (reverse.equalsIgnoreCase(data)) {
			System.out.println("it is palindrome");

		} else {
			System.out.println("it is not palindrome");
		}
	}

}
