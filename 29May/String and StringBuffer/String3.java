package wipro;
import java.util.Scanner;
public class String3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();	
		String rep = "";	
		if (n < 2) rep = str;
		else rep = str.substring(0, 2);
		String output = "";
		for (int i = 0; i < n; i++) {
			output += rep;
		}	
		System.out.println(output);
	}
}