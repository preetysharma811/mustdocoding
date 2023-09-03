package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MimumnRunningSum {


	 public static int minX(List<Integer> arr) {
		 int sum = arr.get(0);
	     for(int i =1;i<arr.size();i++) {
	                sum = sum+arr.get(i); 
	            }
	                return sum; 
		    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 5, 2, 5, 8 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(-5);
		list.add(4);
		list.add(-2);
		list.add(3);
		list.add(1);
		list.add(-1);
		list.add(-6);
		list.add(-1);
		list.add(0);
		list.add(5);
		
	
		
		System.out.println(MimumnRunningSum.minX(list));

	}

}
