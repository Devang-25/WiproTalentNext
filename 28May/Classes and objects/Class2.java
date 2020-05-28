import java.util.*;
class Calculator
{
	static int powerint(int i,int j)
	{
		int c;
		c=(int)Math.pow(i, j);
		return c;
		
	}
	static double power(double a,double b)
	{
		double d;
		d=Math.pow(a, b);
		return d;
	}
}
public class Class2 {
	public static void main(String[] args) {
		int int1,int2,int3;
		double d1,d2,d3;
		System.out.println("enter two integer ");
		Scanner in=new Scanner(System.in);
		int1=in.nextInt();
		int2=in.nextInt();
		System.out.println("enter double integer ");
		d1=in.nextDouble();
		d2=in.nextDouble();
		int3=Calculator.powerint(int1, int2);
		d3=Calculator.power(d1, d2);
		System.out.println("integer pow "+int3);
		System.out.println("double pow "+d3);
	}
}
