package recurssion;

import java.util.Set;
import java.util.TreeSet;

public class FindSubSetWithoutRecursion 
{
	static Set<String> set = new TreeSet<String>();
	/** Total number of combinations formula is 2^lenght -1 */
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		String s = "dbac";
//		int in[] = {1,2,3,4}; 
//		int n = s.length()*s.length()-1;
		int n = (int) (Math.pow(2, s.length())-1);
		
		
		for(int i=n;i>0;i--)
		{
			String binary = getBinayOfANumber(i,s);
//			System.out.println(binary);
			getStringCombo(binary, s);
//			getListCombo(binary, in);
		}
		
		
		System.out.println(set);
		
	}
	
	static void getListCombo(String binary, int[] in)
	{
		String combo="";
		if(binary != null) {
			for(int j=0;j<binary.length();j++)
			{
				if(binary.charAt(j) =='1')
				{
					combo = combo + in[j];
				}
			}
			System.out.println(combo);
		}
	}
	
	static void getStringCombo(String binary, String s)
	{
		
		if(binary != null) {
			String combo="";
			for(int j=0;j<binary.length();j++)
			{
				if(binary.charAt(j)=='1')
				{
					combo = combo+s.charAt(j);
				}
			}
			set.add(combo);
//			System.out.println(combo);
		}
		
//		System.out.println( set.size());
		
	}
	
	static String getBinayOfANumber(int n, String s)
	{
		// To get the binary digit of a number divide the number by 2. Again divide the quotient by 2. Keep doing this until reminder reaches to 
		// 1 or 0.
		/**
		 * when n = 5
		 * 2|Quotient|Reminder  When we divide 5 by 2 then quotient is 2 and reminder is 1. Next we divide 2 which is the quotient by 2. Now quotient
		 * 2|5|                 is 1 and reminder is 0. So the binary representation would be 101
		 * 2|2|1
		 * 2|1|0
		 */
		String binary = "";
		
		while(n>=1)
		{
			// x is the reminder and n is the quotient
			int x = n%2;
			binary = x+binary;
			n=n/2;
		}
		/* The while loop adds 0 to the beginning of the created binary number. This ensures the length of the  binary string is always equal to the 
		 * Length of the actual string.
		 */
		while(binary.length() <s.length())
		{
			binary = "0"+binary;
		}
		
		
		return binary;
	}
	

	
	
	
}
