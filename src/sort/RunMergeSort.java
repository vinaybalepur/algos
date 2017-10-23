package sort;

import java.util.ArrayList;
import java.util.List;

public class RunMergeSort 
{
	public static void main(String[] args) {
		int i[] = {4,2,3,1};
		
		MergeSort.sort(i, 0, i.length-1);
		MergeSort.printValues();
	}
}



class MergeSort
{
	
	public static void printValues()
	{
		System.out.println(MergeSort.list.toString());
	}
	
	public  static void sort(int ar[], int left, int  right)
	{
		int mid =0;
		if(left<right)
		{
			mid = (left+right)/2;
			
			sort(ar, left, mid);
			sort(ar, mid+1, right);
			
			merge(ar, left, mid, right);
		}
	}
	
	private static void merge(int a[], int l, int m, int r)
	{
		int leftListSize = (m+1)-l;
		int rightListSize = r-m;
		
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		
		for(int i=0;i<leftListSize;i++)
		{
			leftList.add(a[i+1]);
		}
		
		for(int i=0;i<rightListSize;i++)
		{
			rightList.add(a[1+m+i]);
		}
		
		getMergedListWithouotDeleting(leftList, rightList);
	}
	
	static ArrayList<Integer> list = new ArrayList<>();
	private static List<Integer> getMergedListWithouotDeleting(List<Integer> i, List<Integer> j)
	{
		int i_pointer = 0;
		int j_pointer = 0;
		
		
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
