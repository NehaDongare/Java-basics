//Print all prime number fron 1 to n
import java.util.Scanner;

public class PrintPrimeNo 
{
	public static void  main(String[] args)
	{
		int n;
		//boolean flag=false;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an upperlimit:");
		n=sc.nextInt();
			
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				//flag= false;
				if(i%j==0)
				{
					count=count +1;
					//flag=true;
					//break;
				}
				
			}
			//if(flag==false)	
			if(count==2)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
