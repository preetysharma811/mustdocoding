package stackandqueue;

import java.util.Stack;

public class ImplementStackUsingQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	void insert(int data)
	{	
		stack1.push(data);
	
	}
	
	int remove()
	{	
		int value=0;
		if(stack1.isEmpty())
		{
			return -1;
		}
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
		
		 if(!stack2.empty())
	        {
			 value =stack2.pop();
	        }
		
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return value;
	
	}

	public static void main(String[] args) {
		ImplementStackUsingQueue queue = new ImplementStackUsingQueue();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		System.out.println(queue.remove());
  
    
	}

}
