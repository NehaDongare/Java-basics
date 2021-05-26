//palindrome number
//121-> resverse number is 121;	if reverse number=original no. then that number is palindrome.

import java.util.Scanner;
public class Palindrome 
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
		{				//initially	-	n=121;			s=0
			r=n%10;		////1) n=121/10=12;	r=121%10=1;	s=0*10+1=1	
			n=n/10;		//2) n=12/10=1;		r=12%10=2;	s=1*10+2=12
			s=s*10+r;	//3) n=1/10=0;		r=1%10=1;	s=12*10+1=121
				
		}
		int reverseno= s;
		System.out.println("The reverse number of "+ originalno + " is "+ reverseno);
		if(originalno==reverseno)
		{
			System.out.println("The number "+ originalno + " is palindrome ");
		}
		else
		{
			System.out.println("The number "+ originalno + " is not palindrome ");
		}
	}

}