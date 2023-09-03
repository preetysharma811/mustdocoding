package stackandqueue;

import java.util.Stack;

public class NextLargerElement {
	Stack<Integer> stack = new Stack<Integer>();
	
	void printNextlargestElement(int a [])
	{
        int k =a.length-1;
		while(k>=0)
		{
			
			stack.push(a[k]);
			k--;
		}
		
		
		for(int i = 0; i<a.length; i++)
		{
			if(i==a.length-1)
			{
				System.out.print("-1,");
				break;
			}

				if (!stack.isEmpty()) {
					
					if (!(stack.peek() > a[i])) {
						while(stack.peek()<=a[i]&&!stack.isEmpty())
						{
							stack.pop();
							if(stack.isEmpty()) {
								System.out.print("-1,");
							 break;
							}
						}
					
					}
					
					if(!stack.isEmpty()) {
					int top = stack.peek();
					System.out.print(top + ",");
					}
				}
				
				else {
					System.out.print("-1,");	
					
				}

		

		}
	}

	public static void main(String[] args) {
		NextLargerElement pc = new NextLargerElement();
		int a1 [] = {1, 3, 2, 4};
		int a2 [] = {4, 3, 2, 1};
		int a3 [] = {4, 5, 2, 25};
		pc.printNextlargestElement(a1);
		System.out.println("");	
		pc.printNextlargestElement(a2);
		System.out.println("");	
		pc.printNextlargestElement(a3);
		////i/p     
		//1 3 2 4
		//4 3 2 1
		//Output
		//3 4 4 -1
		//-1 -1 -1 -1

    
	}

}
