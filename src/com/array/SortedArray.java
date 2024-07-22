package com.array;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 70, 56, 45, -33, 78, 469, 90, 43 };
		for (int n : a) {
			System.out.print(n + "    ");
		}
		Arrays.sort(a);
		System.out.println("");
		for (int n : a) {
			System.out.print(n + "    ");
		}

	}

}
