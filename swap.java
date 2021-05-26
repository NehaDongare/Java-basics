import java.util.Scanner;
public class swap {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		
		System.out.println("Enter first number a =");
		a=sc.nextInt();
		System.out.println("Enter second number b =");
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		//System.out.println("After Swapping" + "a" + a "and b" + b);
		System.out.println("after swapping a is " + a);
		System.out.println("after swapping b is " +b);
	}

}
