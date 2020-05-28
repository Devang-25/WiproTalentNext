import java.util.Scanner;

class Patient
{
	static double bmi(double w,double h)
	{
		double bmi;
		bmi=(w/(h*h))*703;
		return bmi;
	}
}
public class Patients {
	public static void main(String[] args) {
		String name;
		double weight,height;
		System.out.println("enter name ");
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		System.out.println("enter weight and height ");
		weight=in.nextInt();
		height=in.nextInt();
		double bmi=Patient.bmi(weight, height);
		System.out.println("BMI of "+name+" is "+bmi);
	}
}
