package allAlgos;

public class MedianOfTwoSortedArrays 
{
	
	public static void main(String[] args) {
		int arr1[] = {1,3,7,10,11};
		int arr2[] = {2,4,5,6};
		
		int medianOfTwoArray = (arr1.length+arr2.length)/2;
		if(arr1[medianOfTwoArray/2] < arr2[medianOfTwoArray/2])
		{
			System.out.println("Median is " + arr1[medianOfTwoArray/2]);
		}else
		{
			System.out.println("Median is " + arr2[medianOfTwoArray/2]);
		}
		
		
		
	}

}
