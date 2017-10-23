package allAlgos;

import java.util.HashSet;
import java.util.Set;

public class CheckPangrams 
{
	
	public static void main(String[] args) {
		String s = "We promptly judged antique ivory buckles for the next prize";
		System.out.println(isPangram(s));
	}
	
	static String isPangram(String s)
	{
		s = s.toLowerCase().replace(" ", "");
		char c[] = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.contains(c[i]))
			{
				set.add(c[i]);
			}
		}
		
		if(set.size() == 26)
		{
			return "pangram";
		}else
		{
			return "not pangram";
		}
	}

}
