package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBalancingArrayAfterDeletion1 {
	
	
	  public static int countBalancingElements(List<Integer> arr) {
	int sum = 0;
	int result = 0;
	for(int val : arr) {
		sum += val;
	}

	for(int i=0;i<arr.size();i++) {
		int oddSum = 0;
		int oddIndex = 0;
		
		if((sum - arr.get(i))%2 > 0) {
				continue;
		}
		for(int j=0;j<arr.size();j++) {
			if(i == j) {
				oddIndex++;
				continue;
			}
			if(j == 0 || j == oddIndex) {
				oddSum += arr.get(j);
				oddIndex += 2;
			}
		}
		if(sum - arr.get(i) == oddSum * 2)
	
			result++;
	}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,5,2,5,8};
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(5);
		list.add(8);
		
		
		System.out.println(FindBalancingArrayAfterDeletion1.countBalancingElements(list));

	}

}
