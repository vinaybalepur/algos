package recurssion;

public class Factorial {

	
	public static void main(String[] args) {
		int i = getFactRecursive(3);
		System.out.println(i);
	}
	
	static void getFact(int n) {
		
		int fact=1;
		while(n>1)
		{
			fact = fact*n;
			n--;
		}
	
		System.out.println(fact);
		
	}
	
	static int getFactRecursive(int n)
	{
		System.out.println("Inside recursive and value of n is " + n);
		if(n==0)
		{
			return 1;
		}else 
		{
			int i= n*getFactRecursive(n-1);
			System.out.println("The value of i is " + i);
			return i;
		}
		
	}
}
