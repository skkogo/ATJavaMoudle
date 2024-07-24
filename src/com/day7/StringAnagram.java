package com.day7;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s1 = "pot";
		String s2 = "top";
		if (isAnagram(s1, s2)) {
			System.out.println("s1 and s2 are anagram");
		} else {
			System.out.println("s1 and s1 are not anagram");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		boolean status = false;
		if (s1.length() == s2.length())  {
			char[] s1charArray = s1.toCharArray();
			char[] s2charArray = s2.toCharArray();
			// sorting or array
			Arrays.sort(s2charArray);
			Arrays.sort(s1charArray);
			
			for (int index = 0; index < s2charArray.length; index++) {
				if (s1charArray[index] == s2charArray[index]) {
					status = true;
				} else {
					status = false;
					break;
				}
			}
		}
		return status;
	}
}
