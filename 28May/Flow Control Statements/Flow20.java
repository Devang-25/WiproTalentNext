package wipro;
import java.util.Scanner;
public class Flow20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add\n2. Sub");
		int choice = sc.nextInt();
		int op1;
		int op2;
		int result;
		if (choice == 1) {
			System.out.println("Enter first operand: ");
			op1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			op2 = sc.nextInt();
			result = op1 + op2;
		} else {
			System.out.println("Enter first operand: ");
			op1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			op2 = sc.nextInt();
			result = op1 - op2;
		}
		System.out.println("Result: " + result);		
		System.out.println("Do you want to continue? Y or N");		
		sc.nextLine();		
		choice = sc.nextLine().charAt(0);		
		if (choice == 'Y' || choice == 'y') main(args);	
		sc.close();
	}
}
