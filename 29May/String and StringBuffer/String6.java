package wipro;
import java.util.Scanner;
public class String6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String output;
		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		System.out.println(output);
	}
}