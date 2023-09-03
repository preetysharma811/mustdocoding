package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;


public class MinElementFromStackSlidingWindow {
	
	void getMaxFromSlidingWindow(int a [], int k)
	{
		 Deque<Integer> dq= new LinkedList<Integer>();
		 
		  for(int i=0;i<k;i++)
		 {
			  while(!dq.isEmpty()&&a[i]<=a[dq.peekLast()]){
		             dq.removeLast();
		         
			  }
			 dq.addLast(i);
			
		   
		 }
		for (int i = k; i < a.length; i++) {
			
			System.out.print(a[dq.peek()] + " ");
			
			
			while (!dq.isEmpty()&&dq.peek() <= i - k) {
				dq.removeFirst();
			 
			}			
			while (!dq.isEmpty()&&a[i] <= a[dq.peekLast()]) {
				dq.removeLast();
			 
			}
			dq.addLast(i);
		}
		System.out.print(a[dq.peek()]+" ");
	}
	

	public static void main(String[] args) {
		MinElementFromStackSlidingWindow pc = new MinElementFromStackSlidingWindow();
		int a []= {1, 2, 3, 1, 4, 5, 2, 3, 6};
		
		pc.getMaxFromSlidingWindow(a,3);
    
	}

}
