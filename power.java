import java.util.Scanner;
import java.lang.Math;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,a;
		double result;	
		//int i=1;
		System.out.print("Enter a number");
		x=sc.nextInt();
		System.out.print("a= ");
		a=sc.nextInt();
	
		/*while(i<=a)
		{
			result=result*x;
			i++;
		}*/
		result=Math.pow(x,a);
		System.out.println("The result is " + result);
		System.out.println(x + " ^ "+ a+ " = "+ result);
	}

}
