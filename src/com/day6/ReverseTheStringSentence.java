package com.day6;

public class ReverseTheStringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = " It is crazy how saying sentences backwards crates backwards sentences saying how crazy it is ?";
		String ArrData[] = data.split(" ");
		System.out.println(ArrData.length);

		for (int index = ArrData.length - 1; index >= 0; index--) {
			System.out.print(ArrData[index] + " ");
		}
	}

}
