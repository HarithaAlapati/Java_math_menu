import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while (choice != 5) {
			System.out.println("------------MENU----------------");
			System.out.println("1. Print Table of a Number");
			System.out.println("2. Calculate Factorial");
			System.out.println("3. Check Prime Number");
			System.out.println("4. Print Fibonacci Series");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				System.out.println("Enter your number for table : ");
				int n = sc.nextInt();
				for (int i = 1; i <= 10; i++) {
					System.out.println(n + " * " + i + " = " + n * i);
			    } 
				System.out.println("Back to menu? (Y/N): ");
				char u = sc.next().charAt(0);
				break;
				
				
			case 2:
				System.out.println("Enter your number to get factorial: ");
				int n1 = sc.nextInt();
				int fact = 1;
				for (int i = 1; i <= n1; i++) {
					fact = fact * i;
				}
				System.out.println("The factorial of the number is: " + fact);
				System.out.println("Back to menu? (Y/N): ");
				char v = sc.next().charAt(0);
				break;
				
			case 3:
				System.out.println("Enter your number to check for prime: ");
				int n3 = sc.nextInt();
				boolean flag = true;
				if (n3 < 2) {
					flag = false;
				} else {
					int i = 2;
					while (i <= n3/2) {
						if (n3 % i == 0) {
							flag = false;
						    break;
						}
						i++;
					}
				}
				if (flag) 
					System.out.println("Prime Number");
				else 
					System.out.println("Not a prime number");
				
				break;
				
			case 4:
				System.out.println("Enter your number for fibonacci series: ");
				int n4 = sc.nextInt();
				int num1 = 0;
				int num2 = 1;
				for (int i = 1; i <= n4; i++) {
					System.out.print(num1 + " ");
					int num3 = num1 + num2;
					num1 = num2;
					num2 = num3;	
				}
				System.out.println(" ");
				
				System.out.println("Back to menu? (Y/N): ");
				char m = sc.next().charAt(0);
				break;
			
				
			case 5:
				do {
				System.out.println("Exit ");
				} while (false);
				  break;
				  
			default: 
				System.out.println("Invalid");
			}
			
		}
		
				
		

	}
}
