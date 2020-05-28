package wipro;
public class Array3 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int search = 9;
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				index = i + 1;
				break;
			}
		}
		System.out.println(index);
	}
}
