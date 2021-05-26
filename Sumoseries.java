import java.util.Scanner;
public class Sumoseries {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			int n,result;
			System.out.println("Enter a maximum number:");
			n=sc.nextInt();
			
			result=(n*(n+1))/2;
			System.out.println("Result= " + result);
			
	}

}
