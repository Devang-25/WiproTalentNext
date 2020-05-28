package wipro;
import java.util.*;
public class Flow12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0) n *= -1;
		Boolean isPrime = true;
		for (int i = 2; i < n/2+1; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n == 0 || n == 1) isPrime = false;
		if (isPrime) System.out.println("prime");
		else System.out.println("not prime");
	}
}
