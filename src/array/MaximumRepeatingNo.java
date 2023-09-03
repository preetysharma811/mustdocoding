package array;

import java.util.Random;

//Find the maximum repeating number in O(n) time and O(1) extra space

public class MaximumRepeatingNo {

	static void maxRepeating(int arr[]) {
		Random r = new Random();
		int count =0;

		int max = Integer.MIN_VALUE, result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
		
			}
		}

		
		 for(int i = 0; i < arr.length; i++){
	            if(arr[i] == max){
	                ++count;
	                if(r.nextInt(count) == 0){
	                    result = i;
	                } 
	            }
	        }
     System.out.println("max number= "+result);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 4, 3, 4, 1,4,4 };

		maxRepeating(arr);
		 maxRepeating(arr);
		 maxRepeating(arr);
		 maxRepeating(arr);

	}

}
