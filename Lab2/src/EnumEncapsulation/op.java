// the input should be only m or f

package EnumEncapsulation;

enum Gender {
	M,F
}
public class op {
		private String firstName; 
		private String lastName;
		private Gender gender; // we changed the datatype char->gender enum
			
		public op() {
			System.out.println("This is zero-para cons");
		}
		
		public op(String firstName, String lastName, Gender gender) {
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
		
		public void setgender(Gender gender) { // change here also
			if (gender == gender.M || gender == Gender.F) {
				this.gender = gender;
			} else {
				System.out.println("Invalid");
			}
		}
		
		public String getfirst() {
			return firstName;
		}
		
		public String getlast() {
			return lastName;
		}
		public Gender getGender() {
			return gender;
		}
		
		public String display() {
			System.out.println("Inside display method");
			return firstName + " " + lastName + " " + gender ;
		}
	
	
}
