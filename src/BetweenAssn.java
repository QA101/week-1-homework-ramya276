import java.util.Scanner;

public class BetweenAssn {

	
		public static void main(String[] args) {

		int x,y,z;
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		x=console.nextInt();
		System.out.println("Enter Value 2:");
		y=console.nextInt();
		System.out.println("Enter Value 3:");
		z=console.nextInt();
		if((x>y && x<z)||(x>z && x<y))
		{
			System.out.println(x+" is between " +y +" and "+z);
		}
		else
			if((y>x && y<z) ||(y<x && y>z))
		{
			System.out.println(y+" is between " +x +" and "+z);
		
		}
			else
				if((z>x && z<y) && (z<x && z>y))
				{
					System.out.println(z+" is between " +x +" and "+y);
				}
				else 
					System.out.println("GoodLuck!");
		console.close();
		}
		
		
}

