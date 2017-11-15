package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapBasedOnKey 
{
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(3, "c");
		hm.put(0, "a");
		hm.put(1, "b");
		
		
		List<Integer> l = new ArrayList<Integer>(hm.keySet());
		Collections.sort(l, new Sorting());
		
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(hm.get(it.next()));
		}
		
		
	}

}


 class Sorting implements Comparator<Integer>
 {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
		if(arg0 > arg1)
		{
			
			return -1;
		}else if(arg1>arg0)
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
	  
 }
 
