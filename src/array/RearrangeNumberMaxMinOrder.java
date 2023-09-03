package array;

public class RearrangeNumberMaxMinOrder {

	// complexity space o(1) and time o(n)

	public static void rearrangeArray(int[] a) {

		int i = 0;
		int j = a.length - 1;
		String str = "";
		while (j > i) {

			str = str + a[j] + " " + a[i] + " ";

			i++;
			j--;

			//odd number
			
		}
		if (i == j) {
			str = str + a[i] + "";

		}

		System.out.print(str);
	}

	public static void main(String[] args) {

		// array sorted
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };
		rearrangeArray(num);

	}

}
