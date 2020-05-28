import java.util.*;

public class numbers25 {
	public static void main(String[] args) {
		int[] arr = new int[25];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<25; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[24]);
	}
}
