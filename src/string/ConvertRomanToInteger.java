package string;

import java.util.Arrays;

public class ConvertRomanToInteger {
	
/*ROMAN SYMBOL    VALUE
	I             1
	IV            4
	V             5
	IX            9
	X             10
	XL            40
	L             50
	XC            90
	C             100
	CD            400
	D             500
	CM            900 
	M             1000 */  
	
	static int getNum(char r) 
	{ 
	    if (r == 'I') 
	        return 1; 
	    if (r == 'V') 
	        return 5; 
	    if (r == 'X') 
	        return 10; 
	    if (r == 'L') 
	        return 50; 
	    if (r == 'C') 
	        return 100; 
	    if (r == 'D') 
	        return 500; 
	    if (r == 'M') 
	        return 1000; 
	  
	    return -1; 
	} 

	static int romanToInteger(String s){
	int len= s.length();
	
    int res=0;
	
	for(int i =0;i<s.length();i++)
	{
		int num1=getNum(s.charAt(i));
		
		  if (i+1 < len) 
	        { 
			  int num2=getNum(s.charAt(i+1));
			  
			  if(num1>=num2)
			  {
				res=res+num1;  
			  }
			  else {
				  res=res+num2-num1;
				i++;  
			  }
			  
	        }
		  else {
			  res = res + num1; 
		  }
	}
	return res;	
	
	}
	
	public static void main(String[] args) {
		
	
		
		String s1 = "III";
		String s2 = "XI";
	
		int num = romanToInteger(s1);
		
	   System.out.println("roman="+s1);
	   System.out.println("num="+num);
	   
	   
	   System.out.println("roman="+s2);
	   System.out.println("num="+romanToInteger(s2));
	
	}

}
