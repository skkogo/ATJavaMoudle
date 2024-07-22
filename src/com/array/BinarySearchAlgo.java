package com.array;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 40, 60, 80, 90, 100, 150 };
		int key = 1000;
		System.out.println(binarySearchInt(a, key));

	}

	private static int binarySearchInt(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// check if key is present at mid
			if (arr[mid] == key)
				return mid;
			// if key is greater,ignore left half
			if (arr[mid] < key)
				low = mid + 1;
			// if key is smaller , ignore right half
			else
				high = mid - 1;
		}
		return -1;
	}
}
