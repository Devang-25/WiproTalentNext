package wipro;
import java.util.Scanner;
public class String2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();	
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		StringBuffer sb = new StringBuffer();
		sb.append(str1);	
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} 
		else {
			sb.append(str2);
		}	
		System.out.println(sb);		
		sb.append(str1);
	}
}
