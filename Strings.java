import java.util.Scanner;
public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int choice = 0;
		do {
			System.out.println("-----Menu----");
			System.out.println("1.Count number of vowels consonants");
			System.out.println("2.Count number of consonants");
			System.out.println("3.Check if the string is a palindrome");
			System.out.println("4.Reverse the string");
			System.out.println("5.Convert the string to uppercase");
			System.out.println("6.Convert the string to lowercase");
			System.out.println("7.Replace the String");
			System.out.println("8.exit");	
			choice = sc.nextInt();

		
		
		switch(choice) {
		case 1:
			System.out.println("The Vowel count is: " + countVowels(str));
			break;
		case 2:	
			System.out.println("The Consonant count is: " + countConsonants(str));
			break;
		case 3:
			System.out.println("Palindrome :" + isPalindrome(str));
			break;
		case 4:
			System.out.println("Reverse of the string is: " + reverse(str));
			break;
		case 5:
			System.out.println("Uppercase is:" + toUpperCase(str));
			break;
		case 6:
			System.out.println("Lowercase is :" + toLowerCase(str));
			break;
		case 7:
			String word = sc.nextLine();
			String oldString = sc.nextLine();
			String newString = sc.nextLine();
			str = str.replace(oldString, newString);
			System.out.println("Replaced string is: " +  str);
			break;
		case 8:
			break;
		}
		}while(choice != 8);
	}
		
	public static int countVowels(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				count++;
	        }
			return count;
		}
	
	public static int countConsonants(String str) {
		int count = 0;
		int length = str.length();
		str = str.toLowerCase();
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && Character.isLetter(ch))
				count++;
	        }
		return count;
		}
	
	public static boolean isPalindrome(String str) {
        String temp = str;
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev =  str.charAt(i) + rev;
        }
         if (temp.equals(rev))
            return true;
         else
            return false;
            
	}
	
	public static String reverse(String str) {
		 String rev = "";
	        for (int i = 0; i < str.length(); i++) {
	            rev =  str.charAt(i) + rev;
	        }
	         return rev;
	}
	
	public static String toUpperCase(String str) {
		String upper = str.toUpperCase();
		return upper;
	}
	
	public static String toLowerCase(String str) {
		String lower = str.toLowerCase();
		return lower;
		
	}
	
	
	
			
		
	
}
