package sort;

import java.util.Arrays;

public class QuickSort 
{

	static int input[];
	public static void main(String[] args) {
//		int a[] = {27,5,35,6,0,1,40,15};

		input = new int[8];
		input[0]= 27;
		input[1]= 5;
		input[2]= 35;
		input[3]= 6;
		input[4]= 0;
		input[5]= 1;
		input[6]= 40;
		input[7]= 15;
		quickSort(0, input.length-1);
//		partition(a, 0, input.length-1);
//		System.out.println(Arrays.toString(input));
		
		
	}
	static int couter = 1;

	static void quickSort(int low, int high) 
	{
		System.out.println(Arrays.toString(input));
	int i = low; int j = high; 
	// pivot is middle index 
	int pivot = input[low + (high - low) / 2]; 
	System.out.println("Counter " + couter++  + " " + "Pivot " + pivot );
	
	// Partition the array 
	while (i <= j) 
	{ 
		/*** In each iteration, we will identify 
		 * a number from left side which is greater then the pivot value, and a number from right side
		 * which is less then the pivot value. Once search is complete, we can swap both numbers. */ 
		while (input[i] < pivot) 
		{ 
			i++; 
		} 
		while (input[j] > pivot) 
		{ 
			j--; 
		} 
		
		if (i <= j) 
		{
			
			swap(i, j); 
			// move index to next position on both sides
			i++; 
			j--; 
			System.out.println(" -- i " + i + " -- j " + j);
		} 

		// Recursively sort lower half
		if(j>low)
		{
			
			quickSort(low, j);
		}
		// Recursively sort upper half
		if(i<high)
		{
			quickSort(i, high);
		}
		
	}

	}
	
	private static void swap(int i, int j) 
	{ 
		int temp = input[i];
		input[i] = input[j]; 
		input[j] = temp; 
	}

}
