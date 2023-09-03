package array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementInStream2 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the kth ---");
		int k=sc.nextInt();
		System.out.println("enter the size of array ---");
	    int n=sc.nextInt();
	    
	    PriorityQueue<Integer> p =new PriorityQueue<Integer>(k);
	    while(n>0){
	    	System.out.println("\nwindow ---\n");
	        int value=sc.nextInt();
	    	
	        if(p.size()<k-1){
	            p.offer(value);
	            System.out.print("-1 ");
	        }
	        else if(p.size()==k-1){
	            p.offer(value);
	            System.out.print(p.peek()+" is max now at kth \n");
	        }
	        else{
	            if(value > p.peek()){
	            p.poll();
	            p.offer(value);
	            }
	            System.out.print(p.peek()+" is max now at kth\n");
	        }
	        n--;
	    }

	}

}
