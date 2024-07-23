package com.day7;

public class SwappingInArray {

	public static void main(String[] args) {
	int a[]=new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	for (int value:a) {
		System.out.print(value +" ");
	}
	System.out.println("");
	int temp =a[0];
		a[0]=a[1];
		a[1]=a[2];
		a[2]=temp;
		for (int value:a) {
			System.out.print(value + " ");
		} 
		
		
	}

	}


