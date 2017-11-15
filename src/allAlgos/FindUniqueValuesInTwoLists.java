package allAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindUniqueValuesInTwoLists
{
	
	public static void main(String[] args) 
	{
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(1);
		list1.add(0);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(0);
		list2.add(4);
		list2.add(3);
		
		
		
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext())
		{
			int i=it.next();
			if(list2.contains(i))
			{
				int index = list2.indexOf(i);
				list2.remove(index);
				it.remove();
			}
		}

		
		list1.addAll(list2);
	
		System.out.println(Arrays.toString(list1.toArray()));
	}

}
