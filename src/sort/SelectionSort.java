package sort;

import java.util.Arrays;

/**
 * Here we swap the lowest element in the array with the element in the 0th position. We swap the next lowest element with the current element.
 * So initially 10 is swapped with -5 since -5 is the lowest. Then 0 is swapped with 5, 1 is swapped with 7. By this point the entire list is 
 * sorted.  
 * @author vinay
 *
 */
public class SelectionSort
{
	
	public static void main(String[] args) 
	{
		int[] x = {10,5,7,0,1,-5,50};
		
		int indexPointer, temp;
		
		for(int i=0;i<x.length;i++)
		{
			indexPointer = i;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[j]<x[indexPointer])
				{
					indexPointer = j;
				}
			}
			temp = x[i];
			x[i] = x[indexPointer];
			x[indexPointer] = temp;
		}
		
		System.out.println(Arrays.toString(x));
	}

}
