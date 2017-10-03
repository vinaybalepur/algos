package allAlgos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindAndPrintDuplicatesAsList 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new  ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		
		for(int i=0;i<5;i++)
		{
			al.add(i);
		}
		
		System.out.println(findDuplicates(al).toString());
	}
	
	static Set<Integer> findDuplicates(ArrayList<Integer> a)
	{
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> l = new HashSet<Integer>();
		for(int i=0;i<a.size();i++)
		{
			if(l.contains(a.get(i))) {
				s.add(a.get(i));
			}else
			{
				l.add(a.get(i));
			}
		}
		
		return s;
	}

}
