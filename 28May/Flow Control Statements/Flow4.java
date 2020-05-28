package wipro;
import java.util.Scanner;

public class Flow4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		if (x < y) {
			System.out.println(x + ", " + y);
		} 
		else {
			System.out.println(y + ", " + x);
		}
		sc.close();
	}
}
