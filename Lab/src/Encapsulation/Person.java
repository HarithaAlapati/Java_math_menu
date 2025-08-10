/* class person - Firstname, lastname, gender
 create default parametarized constructor */

package Encapsulation;

public class Person {
	private String firstName; 
	private String lastName;
	private char gender;
		
	public Person() {
		System.out.println("This is zero-para cons");
	}
	
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName; 
		this.gender = gender;
		System.out.println("This is 3-para cons");
		System.out.println(firstName + " " + lastName + " " + gender);
	}
	
	public void setfirst(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlast(String lastName) {
		this.lastName = lastName; 
	}
	
	public void setgender(char gender) {
		this.gender = gender;
	}
	
	public String getfirst() {
		return firstName;
	}
	
	public String getlast() {
		return lastName;
	}
	public char getGender() {
		return gender;
	}
	
	
}
