package dsa_by_love_babber.recursion;

public class OptimizedPower {
	
// in log n time
	static int optimizedPower(int num, int n)
	{
		//base condition
		
		if(n==0) {
			
			return 1;
		}
		
		if(n==1) {
			
			return num;
		}
	
		int ans = optimizedPower(num, n/2);
		
		if(n%2==0)
		{
		   return ans*ans;
		}
		
		else {
			 return num*ans*ans;
		}
		
	}

	public static void main(String[] args) {
		//even power
		int num =3;
		int pow =2;
		
		System.out.println("optimized way- power="+pow+" & num="+num+" is " +optimizedPower(num,pow));
		
		//odd power
		int num1 =2;
		int pow1 =5;
		
		System.out.println("optimized way- power="+pow1+" & num="+num1+" is " +optimizedPower(num1,pow1));
		
		

	}

}
