import java.util.Scanner;
public class factorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,result=1;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			result=result*i;
		}
		System.out.println("factorial of " + n +" is " + result);
		
		
	}

}
