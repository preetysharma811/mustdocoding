package linked_list;

public class LinkedList {
	
	Node head;
	
	void insert(int data)
	{
		if(head==null)
		{
			Node newNode = new Node(data);
			
			head = newNode;
		}
		
		else {
	      Node current = head;
	      
	      while(current.next!=null)
	      {
	    	  current = current.next;
	      }
	      
	  	   Node newNode = new Node(data);
	  	   current.next = newNode;
	      
		}
	}
	
	
	void print(Node head)
	{
		Node current = head;
		
		while(current!=null)
		{
			System.out.print(current.data +",");
		    current= current.next;
		
		}
	}



}
