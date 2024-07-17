package com.day3;

public class StudentGradeCalculator {
	/*
	 * Marks of Students of 5 subjects out of 100 Grade of students are based on
	 * following condition : if percentage is greater than 80 percent: Grade-A, will
	 * be print. if percentage is greater than 75 but less than 80: Grade-B, will be
	 * printed. if percentage is greater than 65 but less than 75: Grade-C, will be
	 * printed. if percentage is greater than 45 but less than 65: Gradae-D, will be
	 * printed. if percentage is less than 45: Fail, will be printed.
	 */
	public static void main(String[] args) {

		CalculateGrade(CalculePercentage(CalculateTotalmarks(99, 89, 65, 89, 68)));

	}

	public static double CalculateTotalmarks(double Hindi, double English, double Maths, double Science,
			double SocialScience) {
		double totalmarks = Hindi + English + Maths + Science + SocialScience;
		return totalmarks;
	}

	public static double CalculePercentage(double TotalMarks) {
		double Percentage = (TotalMarks * 100) / 500;
		return Percentage;
	}

	public static void CalculateGrade(double Percentage) {

		if (Percentage > 80)
			System.out.println("Grade-A");// .......................Grade-A

		else if (Percentage > 75 && 80 < Percentage)
			System.out.println("Grade-B");// .......................Grade-B

		else if (Percentage > 65 && Percentage < 75)
			System.out.println("Grade-C");// .......................Grade-C

		else if (Percentage > 45 && Percentage < 65)
			System.out.println("Grade-D");// .......................Grade-D

		else if (Percentage < 45)
			System.out.println("Fail");// .............................Fail

	}

}
