package allAlgos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CheckIfTwoArraysAreSame {

	public static void main(String[] args) {
		int i[] = {1,1,2,3,5,6};
		int j[] = {1,1,2,3,5,0};
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int k=0;k<i.length;k++)
		{
			boolean key = m.containsKey(i[k]);
			if(key == true)
			{
				int value = m.get(i[k]);
				m.put(i[k], (value+1));
			}else
			{
				
				m.put(i[k], 1);
			}
			
		}
		
		boolean newValueAdded = false;
		for(int l=0;l<j.length;l++)
		{
			boolean key = m.containsKey(j[l]);
			if(key == true)
			{
				int value = m.get(j[l]);
				m.put(j[l], (value-1));
			}else
			{
				newValueAdded = true;
				break;
			}
		}
		System.out.println(m.keySet().toString());
		System.out.println(m.values().toString());
		boolean valuesDoNotMatch = false;
		
		if(!newValueAdded)
		{
			Set keys = m.keySet();
			Iterator it  = keys.iterator();
			while(it.hasNext())
			{
				int key = (int) it.next();
				int value = m.get(key);
				if(value>0)
				{
					valuesDoNotMatch= true;
					break;
				}
			}
		}
			
		if(newValueAdded || valuesDoNotMatch)
		{
			System.out.println( "Arrays are not equal");
		}else
		{
			System.out.println("Arrays are equal");
			
		}
	}
}
