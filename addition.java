import java.util.Scanner;
public class addition 
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		int x,y,result;
		System.out.print("Enter first number: ");
		x=sc.nextInt();
		System.out.print("Enter second number: ");

		y=sc.nextInt();
		
		result=x+y;
		System.out.println("The addition of " + x + " and " + y + " is " + result);
		//System.out.println(result);
		
		System.out.print("Enter a fist character: ");
		char c1=sc.next().charAt(0);
		System.out.print("Enter a second character: ");
		char c2=sc.next().charAt(0);
		
		String result1 =String.valueOf(c1)+String.valueOf(c2);
		System.out.println("Addidion of character "+ c1 +" and " + c2+" is "+ result1);
		
	}

}
