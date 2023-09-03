package string;

public class ConvertIntegerToString {
	static String iToA(int num){
		String s = ""; 

         while(num/10!=0)
         {
        	
        	 char ch  = (char)(num % 10 + 48);
        	 //char ch  = (char)(num % 10 + 48);
	         s=s+ch;
			 num=num/10;
		}
         
         s=s+num;
         String reveresed = "";
         for(int i =s.length()-1;i>=0;i--)
         {
        	 reveresed=reveresed+s.charAt(i);
         }
         
		return reveresed;
	
	}
	public static void main(String[] args) {
		
	
		
		int i = 123;
		String b = "96";
	
		String a = iToA(i)+b;
		
	   System.out.println("String append = "+a);
	
	}

}
