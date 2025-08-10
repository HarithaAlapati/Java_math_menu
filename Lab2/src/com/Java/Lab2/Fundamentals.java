/* Write a java program to print person details in the format as shown below:
Figure 12: Sample output of Person details

Details:
First Name: Divya
Last Name: Bharathi
Gender: F
Age: 
Weight: 85.55 */

package com.Java.Lab2;

public class Fundamentals {
	public static void main(String[] args) {
		String firstName = "Bharathi";
		String lastName = "Divya";
		char gender = 'F';
		int age = 23;
		double weight = 85.55;
		
		System.out.println("Details:");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight); 
		
	}
}
