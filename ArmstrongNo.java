/*Armstrong number
 * n=153-> 1*1*1 + 5*5*5 +3*3*3=1+ 125+27=153
 * hence153 is armstrong no.
 */
import java.util.Scanner;
public class ArmstrongNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r,sum=0;
		int originalNo=n;
		while(n>0)
		{					//n=153		sum=0
			r=n%10;			//n=153/10=15;	r=153%10=3;	sum=0+3*3*3=27
			n=n/10;			//n=15/10=1;	r=15%10=5;	sum=27+5*5*5=27+125=152
			sum=sum+r*r*r;	//n=1/10=0;		r=1%10=1;	sum=152+1*1*1=152+1=153
		}
		
		if(sum==originalNo)
		{
			System.out.println("The number "+ originalNo + " is Armstrong number");
		}
		else
		{
			System.out.println("The number "+ originalNo + " is not Armstrong number");
		}
	}

}
