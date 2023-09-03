package dsa_by_love_babber.recursion;

public class StringSubsequence {
	// abc= a,b,c,ab,bc,ac,abc
	static void strSubsequence(String str,int len,int index,String output)
	{
		if(index>=len)
		{
			if(!output.isBlank()) {
			System.out.print(output+",");
			}
			return;
		}
		
		strSubsequence(str,len,index+1,output);
		output+=str.charAt(index);
		strSubsequence(str,len,index+1,output);
		output+=output.substring(0,output.length()-1);
			
	}

	static void strSubsequenceHelper(String str,int len){
		String output="";
//		System.out.println("len:"+len);
//		System.out.println("str:"+str);
		strSubsequence(str,len,0,output);
	}
	public static void main(String[] args) {
		
		String str= "abc";
		
		
	   strSubsequenceHelper(str,str.length());
		

		

	}

}
