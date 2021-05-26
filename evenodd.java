//Sum of even and odd numbers
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<=n;i++)
		{			
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}

			else			{
				oddSum=oddSum+i;	
			}

		}	
		System.out.println("Sum of even numbers is " + evenSum);
		System.out.println("Sum of odd numbers is " + oddSum);
	}
}
