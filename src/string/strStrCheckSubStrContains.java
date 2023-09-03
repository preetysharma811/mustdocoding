package string;

import java.util.Arrays;

public class strStrCheckSubStrContains {


	
	
	//check and return index where the substring is presnt in string 
		static int strStr(String str,String target) {
		
			 int l1 = str.length();
		       int l2 = target.length();
		       
		       int start = 0;
		       for(int i=0;i<l1;i++){
		           if(target.charAt(start) == str.charAt(i)){
		               start++;
		               if(start == l2){
		                return (i+1-l2);
		               }
		           }else{
		               start = 0;
		           }
		       }
		       return -1;
		    }
	
	//pattern matching using KMP algo in o(N) time
		
		void KMPPatternSearch(){
			
		}
	
	
	public static void main(String[] args) {
		
	String s1="geeksforgeeks";
	String s2="gei";
	String s3="for";
	System.out.println("matched at :"+strStr(s1,s2));
	System.out.println("matched at :"+strStr(s1,s3));

	}

}
