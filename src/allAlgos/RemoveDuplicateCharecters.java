package allAlgos;

import java.util.HashSet;

public class RemoveDuplicateCharecters 
{
	
	public static void main(String[] args) {
		String s = "abcddcxa";
		
		char c[] = s.toCharArray();
		
		HashSet hs  = new HashSet();
		for(int i=0;i<c.length;i++)
		{
			hs.add(c[i]);
		}
		
		System.out.println(hs.toString());
	}

}
