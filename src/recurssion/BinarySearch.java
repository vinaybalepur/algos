package recurssion;

/**
 * This search recursivly calls the same binary search method. This replaces the while loop.
 * @author vinay
 *
 */
public class BinarySearch 
{
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9};
//		System.out.println(search(x, 80));
		System.out.println(rSearch(x, 0, x.length-1, 90));
	}
	
	static int search(int[] x, int search)
	{
		int startIndex = 0;
		int endIndex = x.length-1;
		while(true) 
		{
			
			int midpoint = (startIndex+endIndex)/2;

			if(x[midpoint] == search)
			{
				System.out.println("Found");
				return x[midpoint];
			}else if(startIndex>endIndex)
			{
				return -1;
			}
			
			if(x[midpoint]>search)
			{
				endIndex = midpoint-1;
			}else
			{
				startIndex = midpoint +1;
			}
		}
		
	}
	
	
	static int  rSearch(int[] x, int startPoint, int endPoint, int search)
	{
		int midpoint = (startPoint+endPoint)/2;
		if(startPoint>endPoint)
		{
			return -1;
		}
		
		if(x[midpoint] == search)
		{
			System.out.println("Found");
			return x[midpoint];
		}
		if(x[midpoint]>search)
		{
//			endPoint = midpoint-1;
			return rSearch(x, startPoint, midpoint-1, search);
		}else
		{
//			startPoint = midpoint +1;
			return rSearch(x, midpoint+1, endPoint, search);
		}
	}

}
