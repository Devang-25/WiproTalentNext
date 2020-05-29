package wipro;
import java.util.Scanner;
public class String1 {
	public static boolean isPalindrome (String str) {
		int length = str.length();
		boolean isPalindrome = true;
		int range = length / 2;
		if (length % 2 == 0) range--;
		for (int i = 0; i <= range; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
	}
}
