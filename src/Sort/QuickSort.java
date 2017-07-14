package Sort;

import java.util.Arrays;

public class QuickSort 
{

	static int input[];
	public static void main(String[] args) {
		int a[] = {17,41,5,22,54,6,29,3,13};

		input = new int[4];
		input[0]= 4;
		input[1]= 0;
		input[2]= 2;
		input[3]= 1;
		quickSort(0, input.length-1);
//		partition(a, 0, input.length-1);
		System.out.println(Arrays.toString(input));
		
		
	}

	static void quickSort(int low, int high) 
	{
	int i = low; int j = high; 
	// pivot is middle index 
	int pivot = input[low + (high - low) / 2]; 
	// Divide into two arrays 
	while (i <= j) 
	{ 
		/** *In each iteration, we will identify 
		 * a number from left side which is greater then the pivot value, and a number from right side
		 *  which is less then the pivot value. 
		Once search is complete, we can swap both numbers. */ 
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
		} 

		// calls quickSort() method recursively
		if(low<j)

		{
			quickSort(low, j);
		}if(i<high)
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

	

	static int[] partition(int a[], int i, int j)
	{
		int pivot = a.length-1;
				int leftPointer = i;
				int rigthPointer = j;

		while(true)
		{
			if(a[leftPointer]>a[pivot] & a[rigthPointer]<a[pivot])
			{
				int temp = a[leftPointer];
				a[leftPointer] = a[rigthPointer];
				a[rigthPointer] = temp;
				leftPointer = leftPointer+1;
				rigthPointer = rigthPointer-1;
			}else if(rigthPointer==leftPointer)
			{
				int temp = a[pivot];
				a[pivot] = a[leftPointer+1];
				a[leftPointer+1] = temp;
				System.out.println(a.toString());
				break;
			}else
			{
				rigthPointer = rigthPointer-1;

			}
		}
		return partition(a, i, j);
	}

}
