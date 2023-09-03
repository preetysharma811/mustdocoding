package linked_list;

public class ReverseInGroup {

	
	static Node reverseIngroup(Node head, int k)
	{
		
		if(head == null) {
	          return null;
	     }
		
		Node current = head ;
		Node prev=null;
		Node next = null;
		int count = 0;
		
	
		
		while(current !=null && count <k)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;		
		}
		
		 if (next!= null) {
	            head.next = reverseIngroup(next, k);
		 }
		
		//head=prev;
		return prev;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList list = new LinkedList();
	
	int [] arr = {10,20, 30, 50,60,80, 90,120,130, 140};
	
	for(int i = 0;i <arr.length ; i++)
	{
		 list.insert(arr[i]);
	
	}
 		
	    list.print(list.head);
		Node newhead=reverseIngroup(list.head, 3);	
		System.out.println("\nreversed---");
		list.print(newhead);
		

	}

}
