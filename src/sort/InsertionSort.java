package sort;

import java.util.Arrays;

/**
 * 
 * @author vinay
 * In insertion sort the values to the current value should be sorted. The assumption is 0th index is already sorted. Start the search from
 * 1st index. The key value is the current value that should be sorted. If the pointer, j, is equal to greater than 0 and if key is less then 
 * array[j] then the values are sorted and j is reduced by 1. This happens till j becomes lesser than 0. i.e the value is placed at the 0th index
 * or till key is greater than current index value. Here number of swaps is reduced greatly increasing the speed of sort.
 */
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int a[] = {4,3,1,5,2,-5,3};
		int  key,j, temp;
		
		for(int i=1;i<a.length;i++)
		{
			key = a[i];
			j=i-1;
			while(j>=0 && key<a[j])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				j--;
			}
		}
		
		
		System.out.println(Arrays.toString(a));
	}
	
	
	

}
