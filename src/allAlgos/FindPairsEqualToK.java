package allAlgos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Always use sort and find logic. It will work for repeated numbers, negative numbers and easy to remember as well.
 * Sort the given array using Array.sort method.
 * Have two pointers, left and right. 
 * Get the sum of both left and right pointed values.
 * If sum is greater than k, then decrement right pointer else increment left pointer.
 * If sum matches k, then increment left and decrement right.
 * Run the loop until left and right are not equal.
 * @author vinay
 *
 */
public class FindPairsEqualToK 
{
	
	public static void main(String[] args) 
	{
		int in[] = {8,7,6,5,4,3,2,1};
		int k = 8;
		
//		findPairsUsingHashMap(in, k);
		findPairsUsingInPlaceSorting(in, k);
		
	}
	
	static void findPairsUsingInPlaceSorting(int in[], int k)
	{
		Arrays.sort(in);
		
		int leftPointer =0;
		int rightPointer = in.length-1;
		while(leftPointer!=rightPointer)
		{
			int leftValue= in[leftPointer];
			int rightValue = in[rightPointer];
			int sum = leftValue + rightValue;
			
			if(sum >k)
			{
				--rightPointer;
			}else if(sum<k)
			{
				++leftPointer;
			}else
			{
				--rightPointer;
				++leftPointer;
				System.out.println("{" + leftValue + "," + rightValue + "}");
			}
		}
		
	}
	
	static void findPairsUsingHashMap(int[] numbers, int n)
	{
		Set set = new HashSet(numbers.length); 
		
		for(int value : numbers){ 
			int target = n - value; 
		// if target number is not in set then add 
		if(!set.contains(target)){ 
			set.add(value); 
			}else 
			{ 
				System.out.printf("(%d, %d) %n", value, target); 
			}
		}
		
		
	}
	
}
		
		
		
			
