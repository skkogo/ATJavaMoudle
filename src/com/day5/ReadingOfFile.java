package com.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingOfFile {
	public static void main(String []args) throws FileNotFoundException{
		//locating the file 
		File myFile = new File("C:\\Users\\manis\\Desktop\\AutomationTestingProject\\JavaMoudle\\ATJavaMoudle\\src\\Data\\studen.txt");
		//which file to read
		Scanner s= new Scanner(myFile);
		//reading the file and printing on console
		while(s.hasNext()) {
			//reading the file and printing on console
			System.out.println(s.next());
		}
		
	
	}
}
