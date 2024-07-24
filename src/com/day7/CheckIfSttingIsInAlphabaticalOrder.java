package com.day7;

import java.util.Arrays;

public class CheckIfSttingIsInAlphabaticalOrder {
	public static void main(String[] args) {
		String data = "absolute";
		char[] StringArray = data.toCharArray();
		System.out.println("before Sorting");
		System.out.println(StringArray);
		// sorting of array
		Arrays.sort(StringArray);

		System.out.println("after sorting");
		System.out.println(StringArray);
	}
}
