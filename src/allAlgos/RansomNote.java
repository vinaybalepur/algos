package allAlgos;

import java.util.HashMap;
import java.util.Map;

public class RansomNote 
{
	
	public static void main(String[] args) {
		String magazine = "two times three is not four";
		String ransom = "two times two is four";
		
		String ran[] = ransom.split(" ");
		String mag[] = magazine.split(" ");
		
		Map<String,Integer> magMap = new HashMap<String,Integer>();
		
		for(int i=0;i<mag.length;i++)
		{
			String s = mag[i];
			if(magMap.containsKey(s))
			{
				int value = magMap.get(s);
				++value;
				magMap.put(s, value);
			}else
			{
				magMap.put(s, 0);
			}
		}
		
		boolean canFormRansomNote = true;
		for(int i=0;i<ran.length;i++)
		{
			
			String ranKey = ran[i];
			if(magMap.containsKey(ranKey))
			{
				int value = magMap.get(ranKey);
				--value;
				if(value<0)
				{
					magMap.remove(ranKey);
				}
			}else
			{
				canFormRansomNote =false;
			}
		}
		
		System.out.println(canFormRansomNote);
	}

}
