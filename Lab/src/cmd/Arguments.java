/* Write a program to accept a number from user as a command line argument and 
 * check whether the given number is positive or negative number.*/
package cmd;
import java.util.Scanner;

public class Arguments {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		
		if (num > 0) {
            System.out.println(num + " is a Positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }
			 
		}
	}

