package com.array;

public class UnsortedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 20, 40, 60, 70, 9, 60, 56, 78 };
		int key=699;
		SearchElementArray(a, key);
			}
public static void SearchElementArray(int array[],int KeyToFound) {
	int position=0;
	boolean isFound =false;
	for (int index = 0; index < array.length; index++) {
		if (array[index]==KeyToFound) {
		position=index;
		isFound=true;
		}
				}
				
				if(isFound) {
					System.out.println("element fount at index " + position);
					
				}
				else { System.out.println("element not found");
				}

}
}
