package wipro;
import java.util.*;
public class Flow15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println(sum);
	}
}
