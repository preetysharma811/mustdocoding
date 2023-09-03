package dsa_by_love_babber.recursion;

import java.util.ArrayList;
import java.util.List;

public class IntegerSubset {
	
	// powerset or subset
	// {1,2,3}= {{},{1},{2,{3},{1,2},{1,3},{2,3},{1,2,3}}
	//complexity 0(2powN)
	static void integerSubset(int arr [],int index, List<Integer> subset, List<List<Integer>> outputList)
	{
		//base condition
		if(index>=arr.length) {
			outputList.add(new ArrayList<>(subset));	
			return;
		}
		
		//exclude element at index
		integerSubset(arr,index+1,subset,outputList);
			
		//include element at index in subset
		subset.add(arr[index]);

		
		integerSubset(arr,index+1,subset,outputList);
		subset.remove(subset.size() - 1);
		 
	}
	
	static void integerSubsetHelper(int [] arr, int n)
	{
		List<List<Integer>> outputList = new ArrayList<>();
		List<Integer> subsetList = new ArrayList<>();
		int index =0;
		integerSubset(arr,index,subsetList,outputList);
		System.out.println(outputList);

	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		 integerSubsetHelper(arr,arr.length);
		

	}

}
