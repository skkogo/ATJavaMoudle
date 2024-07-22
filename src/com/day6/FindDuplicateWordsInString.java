package com.day6;

import java.util.HashSet;

public class FindDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "What lies behind us and what lies before us are tiny compared to what lies within us";
		
		// split the data in array index
		String ArrayData[] = data.split(" ");
		
		// HashSet
		HashSet<String> result = new HashSet<String>();
		HashSet<String> FinalResult = new HashSet<String>();
		for (String y : ArrayData) {
			
			//add the data in result
			if (!(result.add(y))) {
				FinalResult.add(y);
			}

		}
		System.out.println(FinalResult);

	}
}
