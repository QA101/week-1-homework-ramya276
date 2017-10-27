import java.util.Scanner;


	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
public class FindMax {
	

	public static void main(String[] args) {
	
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1=console.nextInt();
		System.out.println("Enter Number 2: ");
		int num2=console.nextInt();
		if (num1>num2)
		{
			System.out.println(num1 + " is the Max");
		}
		else 
			System.out.println(num2+ " is the max");
		}
	}

