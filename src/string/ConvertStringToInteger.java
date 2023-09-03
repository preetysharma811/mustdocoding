package string;

import java.util.Arrays;

public class ConvertStringToInteger {

	
	static int atoi(String s){
		int res = 0; 
		int zero='0';
		int one ='1';
		System.out.println(zero);
		System.out.println(one);
		int dif=one-zero;
		System.out.println(dif);
		for(int i =0;i<s.length();i++) {
			 res = res * 10 + s.charAt(i) - '0'; 
			// res = res * 10 + s.charAt(i) - 48;  
		}
		return res;
	
	}
	public static void main(String[] args) {
		
	
		
		String s3 = "12";
		int b = 1;
	
		int sum = atoi(s3)+b;
		
	   System.out.println("sum = "+sum);
	
	}

}
