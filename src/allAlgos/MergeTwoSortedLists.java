package allAlgos;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists 
{
	public static void main(String[] args) {
		
		
		List<Integer> i = new  ArrayList<Integer>();
		List<Integer> j = new  ArrayList<Integer>();
		i.add(2);
		i.add(5);
		i.add(20);
		
		
		j.add(1);
		j.add(3);
		j.add(20);
		j.add(25);
		
		
		List<Integer> mergedList = getMergedListWithouotDeleting(i,j);
		System.out.println(mergedList);
	}
	
	static List<Integer> getMergedList(List<Integer> i, List<Integer> j)
	{
		
		
		List<Integer> list = new  ArrayList<Integer>();
		while(!(i.isEmpty())  || !(j.isEmpty()))
		{
			if(i.isEmpty())
			{
				for(int k=0;k<j.size();k++)
				{
					list.add(j.get(k));
					j.remove(0);
				}
			}else if(j.isEmpty())
			{
				for(int k=0;k<i.size();k++)
				{
					list.add(i.get(k));
					i.remove(0);
				}
			}
			else
			{
				if(i.get(0)<j.get(0))
				{
					list.add(i.get(0));
					i.remove(0);
				}else if(i.get(0)>j.get(0))
				{
					list.add(j.get(0));
					j.remove(0);
				}else
				{
					list.add(i.get(0));
					list.add(j.get(0));
					i.remove(0);
					j.remove(0);
				}
			}
		}
		return list;
	}
	
	public static List<Integer> getMergedListWithouotDeleting(List<Integer> i, List<Integer> j)
	{
		int i_pointer = 0;
		int j_pointer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while(i_pointer < i.size() || j_pointer < j.size())
		{
			if(i_pointer>i.size()-1)
			{
				for(int k=j_pointer;k<j.size();k++)
				{
					list.add(j.get(j_pointer++));
				}
			}else if(j_pointer>j.size()-1)
			{
				for(int k=i_pointer;k<i.size();k++)
				{
					list.add(i.get(i_pointer++));
				}
			}else
			{
				if(i.get(i_pointer)<j.get(j_pointer))
				{
					list.add(i.get(i_pointer++));
				}else if(i.get(i_pointer)>j.get(j_pointer))
				{
					list.add(j.get(j_pointer++));
				}else
				{
					list.add(j.get(j_pointer++));
					list.add(i.get(i_pointer++));
				}
			}
			
		}
		return list;
	}

}
