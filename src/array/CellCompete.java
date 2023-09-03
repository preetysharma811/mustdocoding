package array;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;

import java.util.Set;

public class CellCompete {

	List<Integer> lengthEachScene(List<Character> inputList) {
		List<Integer> m = new ArrayList();
	     int left = 0;
	     int  right = -1;
	      ans = 0
	      while (right<len(S)-1:)
	         if right - left + 1 == K:
	            ans+=1
	            m[S[left]]-=1
	            left+=1
	            continue
	         if S[right+1] not in m :
	            m[S[right+1]]=1
	            right+=1
	         elif not m[S[right+1]]:
	            m[S[right+1]]+=1
	            right+=1
	         else:
	            m[S[left]]-=1
	            left+=1
	      if right - left + 1 == K:
	         ans+=1
	      return ans
	}

	public static void main(String[] args) {
		CellCompete c = new CellCompete();
		List<Character> inputList = new ArrayList<Character>();
		inputList.add('a');
		inputList.add('b');
		inputList.add('c');
		inputList.add('d');
		inputList.add('a');
		inputList.add('e');
		inputList.add('f');
		inputList.add('g');
		inputList.add('h');
		inputList.add('i');
		inputList.add('j');
		inputList.add('e');
		
		System.out.println(c.lengthEachScene(inputList));
	}

}
