package sort;

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
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}
