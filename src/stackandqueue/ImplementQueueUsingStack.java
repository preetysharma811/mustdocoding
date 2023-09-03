package stackandqueue;


import java.util.LinkedList;
import java.util.Queue;


public class ImplementQueueUsingStack {

	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	
	void insert(int data)
	{	
		queue1.add(data);
	}
	
	int remove()
	{	
		
		 if (queue1.isEmpty())
		        return -1;

		int s =queue1.size();
		while(s!=1)
		{
			queue2.add(queue1.poll());
			
			s--;
		}
		
		int val=queue1.poll();
		
		while(!queue2.isEmpty())
		{		
			queue1.add(queue2.peek());
			queue2.poll();
		}
		return val;
	
	}

	
	public static void main(String[] args) {
		ImplementQueueUsingStack stack = new ImplementQueueUsingStack();
		stack.insert(1);
		stack.insert(2);
		stack.insert(3);
		stack.insert(4);
		System.out.println(stack.remove());
		stack.insert(5);
		stack.insert(6);
		System.out.println(stack.remove());
		
	
	}

}
