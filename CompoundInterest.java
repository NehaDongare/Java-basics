import java.lang.Math;
public class CompoundInterest {

	public static void main(String[] args)
	{
		double p=20000,A;
		double r=6,CI;
		int t=3;
		
		A=p*Math.pow((1+r/100),t);
		CI=A-p;
		System.out.println("Compound amount is " + A );
		System.out.println("Comound interest is " + CI);
		
	}

}
