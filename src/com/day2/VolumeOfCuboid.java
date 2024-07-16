package com.day2;

public class VolumeOfCuboid {
	public static void main(String[]args) {
double v= CalculateVolumeOfCuboid(10,23,56); //calling of the function
		System.out.println(v);
		double v2=CalculateVolumeOfCuboid(10.5,34.5,78.8);
		System.out.println(v2);
	}
public static double	CalculateVolumeOfCuboid(double side1 ,double side2,double side3){
	System.out.println("volume of double data type");
	double volume =side1*side2*side3;
return volume;
			
}
public static double CalculateVolumeOfCuboid(int side1,int side2, int side3) {
	System.out.println("volume of int data type");
	double volume=side1*side2*side3;
	return volume;
}

}