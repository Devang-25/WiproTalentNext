package wipro;
import java.util.Scanner;
public class String9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : strs)
			sb.append(x);
		System.out.println(sb);
	}
}