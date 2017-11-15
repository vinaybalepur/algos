package allAlgos;

public class LongestPalindromeInString 
{
	
	public static void main(String[] args) {
		String str = "abmommadamcd";
		String s = "";
		int palindromeLen = 0;
		for(int i=0;i<str.length()-2;i++)
		{
			for(int j=i+2;j<str.length();j++)
			{
				s= str.substring(i, j+1);
				if(s.charAt(0) == s.charAt(s.length()-1))
				{
					if(checkForPalindrome(s))
					{
						if(s.length() > palindromeLen)
						{
							palindromeLen = s.length();
						}
					}
				}
			}
		}
		
		System.out.println(palindromeLen);
	}
	
	static boolean checkForPalindrome(String s)
	{
		String newstr = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			newstr = newstr + s.charAt(i);
		}
		
		if(newstr.equals(s))
			return true;
		return false;
	}

}
