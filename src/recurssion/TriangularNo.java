package recurssion;

public class TriangularNo 
{
	
	public static void main(String[] args) {
		
//		System.out.println(triangle(4));
//		System.out.println(rTriangle(4));
		System.out.println(factorial(5));
	}
	
	static int triangle(int n)
	{
		int total =0;
		while(n>0)
		{
			total = total+n;
			--n;
		}
		
		return total;
	}
	
	static int rTriangle(int n)
	{
		if(n==1)
		{
			return 1;
		}else {
			System.out.println("Else");
			return (n + rTriangle(n-1));
		}
	}
	
	static int factorial(int n)
	{
		if(n ==1)
		{
			return 1;
		}else {
			return (n * factorial(n-1));
	
		}
	}

}
