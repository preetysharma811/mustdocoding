package array;

public class ExampleArray {

	int[] insertArray(final int arr1[], final int pos, final int value) {
		int n = arr1.length;
		for (int i = n - 1; i >= pos; i--) {
			arr1[i] = arr1[i - 1];
		}

		arr1[pos - 1] = value;
		n++;

		return arr1;

	}

	int[] deleteArray(int arr1[], int pos) {
		int n = arr1.length;
		for (int i = pos; i < n; i++) {
			arr1[i - 1] = arr1[i];

		}

		int[] returnThis = new int[arr1.length - 1];
		for (int i = 0; i < returnThis.length; i++) {
			returnThis[i] = arr1[i];
		}

		return returnThis;
	}

	void traveseArray(int arr1[]) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + "");
		}
	}

	public static void main(String arg[]) {
		int arrInsert[] = { 33, 44, 66, 77, 88, 99, 111 };
		int arrDelete[] = { 1, 2, 3, 4, 5, 6, 7 };
		ExampleArray eg = new ExampleArray();
		int[] updatedArr = eg.insertArray(arrInsert, 3, 55);
		 System.out.println("after insert==========");
		 eg.traveseArray(updatedArr);
		int[] updatedArr1 = eg.deleteArray(arrDelete, 3);
		System.out.println("after delete==========");
		eg.traveseArray(updatedArr1);
		
		

	}

}
