//Reverse a number.		153->	351

import java.util.Scanner;
public class Reverse
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int r,s=0;
		int originalno=n;
		while(n>0)
		{				//initially	-	n=153;		r=153%10=3;		s=0
			r=n%10;		////1) n=153/10=15;	r=153%10=3;	s=0*10+3=3	
			n=n/10;		//2) n=15/10=1;		r=15%10=5;	s=3*10+5=35
			s=s*10+r;	//3) n=1/10=0;		r=1%10=1;	s=35*10+1=351
				
		}
		int reverseno= s;
		System.out.println("The reverse number of "+ originalno + " is "+ reverseno);
			
	}

}
