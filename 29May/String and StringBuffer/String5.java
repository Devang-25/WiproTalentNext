package wipro;
import java.util.Scanner;
public class String5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.substring(1, str.length() - 1);
		System.out.println(str);
	}
}