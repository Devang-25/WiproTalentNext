package wipro;
import java.util.Scanner;
public class String8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int sep = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < sep - 1; i++) 
			sb.append(a).append(b);
		sb.append(a);
		System.out.println(sb);
	}
}