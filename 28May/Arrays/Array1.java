import java.util.*;
public class Array1 {
	public static void main(String[] args)
	{
		int n,sum=0,avg=0;
		int c;
		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{		
			c=in.nextInt();
			a[i]=c;		
		}		
		for(int j=0;j<n;j++)
		{
			sum=sum+a[j];
		}	
		System.out.println(sum);
		System.out.println("average is "+(sum/n));		
	}
}
