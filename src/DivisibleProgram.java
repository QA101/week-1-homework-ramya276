import java.util.Scanner;

/*
		 * Define a program that determines whether a number x is divisible by a number y.
		 * 
		 * If x is divisble by y, the program will print TRUE otherwise FALSE
		 * 
		 * Such as:
		 * x -> 10
		 * y -> 5
		 * 10 divided by 5 is 2 with 0 remainder. The program would print true
		 */

public class DivisibleProgram {
			public static void main(String args[]){
			Scanner console=new Scanner(System.in);
			System.out.println("Enter numerator:");
			int x=console.nextInt();
			System.out.println("Enter Denominator:");
			int y=console.nextInt();
			int rem=x%y;
				if (rem==0)
					{
						System.out.println("True");
					}
					else 
						System.out.println("False");
console.close();
			}
			
}