package wipro;
import java.util.*;
public class Array2 {
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
		for (int j=0;j<n;j++)
		{
			for( int k=0;k<n;k++)
			{
				if(a[j]>a[k])
				{
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println("maximum is "+a[0]);
		System.out.println("minimum is "+a[n-1]);	
	}
}
