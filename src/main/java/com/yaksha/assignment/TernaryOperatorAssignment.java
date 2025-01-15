package com.yaksha.assignment;

public class TernaryOperatorAssignment {

	public static void main(String[] args) {

		// Task 1: Check if a number is positive, negative, or zero using ternary
		// operator
		int number = 0;
		String result = (number > 0) ? "The number " + number + " is positive."
				: (number < 0) ? "The number " + number + " is negative." : "The number " + number + " is zero.";
		System.out.println(result);

		// Task 2: Find the smallest of three numbers using ternary operator
		int a = 10, b = 5, c = 15;
		int smallest = (a <= b && a <= c) ? a : (b <= c) ? b : c;
		System.out.println("The smallest number is: " + smallest);

		// Task 3: Check if a number is divisible by 3, 5, or both using ternary
		// operator
		int num = 15;
		String divisibilityResult = (num % 3 == 0 && num % 5 == 0)
				? "The number " + num + " is divisible by both 3 and 5."
				: (num % 3 == 0) ? "The number " + num + " is divisible by 3."
						: (num % 5 == 0) ? "The number " + num + " is divisible by 5."
								: "The number " + num + " is divisible by neither 3 nor 5.";
		System.out.println(divisibilityResult);

		// Task 4: Grade calculation based on marks using ternary operator
		int marks = 82;
		String grade = (marks >= 90) ? "Grade: A"
				: (marks >= 75) ? "Grade: B" : (marks >= 50) ? "Grade: C" : "Grade: F";
		System.out.println(grade);

		// Task 5: Check leap year using ternary operator
		int year = 2024;
		String leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				? "The year " + year + " is a leap year."
				: "The year " + year + " is not a leap year.";
		System.out.println(leapYear);
	}
}
