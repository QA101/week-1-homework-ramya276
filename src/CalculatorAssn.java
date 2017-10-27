import java.util.*;
public class CalculatorAssn {
static int num1, num2;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("Enter Number1:");
		num1=console.nextInt();
		System.out.println("Enter Number2:");
		num2=console.nextInt();
		console.close();
sum();
diff();
prod();
quo();
bigger();
}

	public static void sum()
	{
		int sum=num1+num2;
		System.out.println("Sum:"+sum);
		
	}
	public static void diff()
	{
		int diff=num1-num2;
		System.out.println("Difference:"+diff);
		
	}
	public static void prod()
	{
		int prod=num1*num2;
		System.out.println("Product:"+prod);
		
	}
	public static void quo()
	{
		int quo=num1/num2;
		System.out.println("Quotient:"+quo);
		
	}
	public static void bigger()
	{
		if (num1>num2) {
		System.out.println(num1+" is bigger");
		}else
			System.out.println(num2+" is bigger");
	}
}