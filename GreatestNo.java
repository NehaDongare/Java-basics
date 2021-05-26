import java.util.Scanner;
public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter a number a= ");
		a=sc.nextInt();
		System.out.println("Enter a number b= ");
		b=sc.nextInt();
		System.out.println("Enter a number c= ");
		c=sc.nextInt();

		
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a + " is a greatest number");
		}
		else if(b>c)
		{
			if(b>a)
				System.out.println(b + " is a greatest number");
		}
		else
			System.out.println(c + " is a greatest number");
	}

}
