package allAlgos;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharecter
{
	
	public static void main(String[] args) {
		System.out.println(getFirstNonRepeatedCharecter("aabbcc"));
	}
	
	
	static char getFirstNonRepeatedCharecter(String str)
	{
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char key = str.charAt(i);
			if(lhm.containsKey(key))
			{
				lhm.put(key, (lhm.get(key)+1));
			}else
			{
				lhm.put(key, 0);
			}
		}
		
		for(Entry<Character,Integer> entry : lhm.entrySet())
		{
			if(entry.getValue() == 0)
			{
				return entry.getKey();
			}
		}
		return '0';
	}

}
