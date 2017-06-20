package Arrays;

public class BinaySearch 
{
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for(int i=0;i<10;i++)
		{
			arr[i] = i;
		}
		
		int valueToSearch = 9;
		
		int  lowerBound =0;
		int  upperBound=arr.length-1;
		
		int counter =0;
		while(true)
		{
			int midPoint = (lowerBound + upperBound)/2;
			counter = counter +1;
			if(arr[midPoint]==valueToSearch)
			{
				System.out.println(counter);
				System.out.println("value found at position " + arr[midPoint]);
				break;
			}else if(lowerBound > upperBound)
			{
				break;
			}else
			{
				if(arr[midPoint] <valueToSearch  )
				{
					lowerBound = midPoint+1;
				}else if(arr[midPoint] >valueToSearch)
				{
					upperBound = midPoint-1;
				}
			}
		}
	}

}
