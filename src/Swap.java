
public class Swap {
	
	public static void main(String args[])
	{
		swapTwo();	
		swapThree();
	}
	public static void swapTwo()
		{
		int a=5,b=7, temp;
		System.out.println("Initial Values: \nA:"+a+"  B:"+b);
		temp=a;
		a= b;
		b=temp;
		System.out.println("Swapped Values: \nA:"+a+"  B:"+b);
		}

	
	public static void swapThree()
	{
	int x=5,y=7, z=3;
	System.out.println("Initial Values: \nX:"+x+ "  "+"Y:"+y+ "  Z:"+z);
	 x = x + y + z;  //15 
	 y = x - (y+z);  //15-10 =5
	 z = x - (y+z);  //15-8=7
	 x = x - (y+z); //15-12=3
	System.out.println("Swapped Values:\nX:"+x+ "  "+"Y:"+y+ "  Z:"+z);
	}
}
