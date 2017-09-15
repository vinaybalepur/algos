package recurssion;

import java.util.List;

public class FindSubSetWithoutRecursion 
{
	/** Total number of combinations formula is n^2 -1 */
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		String s = "abcd";
		int in[] = {1,2,3,4}; 
		int n = s.length()*s.length()-1;
		
		
		for(int i=n;i>0;i--)
		{
			String binary = getBinayOfANumber(i,s);
			getStringCombo(binary, s);
//			getListCombo(binary, in);
		}
		
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
			System.out.println(combo);
		}
	}
	
	static String getBinayOfANumber(int n, String s)
	{
		// To get the binary digit of a number divide the number by 2. Again divide the reminder by 2. Keep doing this until reminder reaches to 
		// 1 or 0.
		/**
		 * when n = 5
		 * 2|Quotient|Reminder  When we divide 5 by 2 then quotient is 2 and reminder is 1. Next we divide 2 which is the quotient by 2. Now quotient
		 * 2|5|                 is 1 and reminder is 0. So the binary representation would be 101
		 * 2|2|1
		 * 2|1|0
		 */
		String str = "";
		
		while(n>=1)
		{
			// n is the reminder and x is the quotient
			int x = n%2;
			str = x+str;
			n=n/2;
		}
		/* The while loop adds 0 to the beginning of the created binary number. This ensures the length of the  binary string is always equal to the 
		 * Length of the actual string.
		 */
		while(str.length() <s.length())
		{
			str = "0"+str;
		}
		
		/** 
		 * There is a null check because if the length of the string is 3 then total combinations would be 7. But the combinations formula
		 * give the total combinations as 8. The binary of 8 is 1000. This is longer than the string length and hence it is invalid. 
		 * So return null if the length of the binary string  is greater than actual String length.
		 */
		if(str.length() > s.length())
		{
			return null;
		}
		return str;
	}
	

	
	
	
}
