import java.util.*;
class Box
{
	 
	double vol(double a,double b,double c) 
	{
		double volume;
		volume=a*b*c;
		return(volume);
	}
	
}
public class Class1 {

	public static void main(String[] args) {
		double height, width, depth;
		Scanner in = new Scanner(System.in);
		Box a =new Box();
		height=in.nextDouble();
		width=in.nextDouble();
		depth=in.nextDouble();
		double v=a.vol(height, width, depth);
		System.out.println("volume is "+v);
	}

}
